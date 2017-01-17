package com.greenfox.szilvi.calorie.services;

import com.greenfox.szilvi.calorie.models.Meal;
import com.greenfox.szilvi.calorie.models.MealType;
import com.greenfox.szilvi.calorie.repositories.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

/**
 * Created by ${SzilviaB} on 2017. 01. 08..
 */
@Component
public class CalorieService {

    @Autowired
    MealRepository mealRepo;

    public void countSumAndAv (Model model){
        int sum = 0;
        int count = 0;
        for (Meal meal: mealRepo.findAll()) {
            sum += meal.getCalorie();
            count++;
        }
        model.addAttribute("sum", sum);
        model.addAttribute("avgpermeal", (double)sum/count);
    }

    public Page<Meal> findMeals(Pageable pageable) {
        return mealRepo.findAll(pageable);
    }

    public void findAndEditMeal(long id, Model model){
        Meal meal = mealRepo.findOne(id);
        model.addAttribute("editedMeal", meal);
    }

    public void findAndUpdateMeal(long id, String name, int calorie,
                                  String createdAt, MealType type){
        Meal meal = mealRepo.findOne(id);
        meal.setName(name);
        meal.setCalorie(calorie);
        meal.setCreatedAt(createdAt);
        meal.setType(type);
        mealRepo.save(meal);
    }



}
