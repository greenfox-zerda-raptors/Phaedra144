package com.greenfox.szilvi.calorie.controller;

import com.greenfox.szilvi.calorie.models.Meal;
import com.greenfox.szilvi.calorie.models.MealType;
import com.greenfox.szilvi.calorie.services.CalorieService;
import com.greenfox.szilvi.calorie.repositories.MealRepository;
import com.greenfox.szilvi.calorie.repositories.MealTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/**
 * Created by ${SzilviaB} on 2017. 01. 08..
 */
@Controller
@RequestMapping("/meals")
public class CalorieController {

    @Autowired
    MealRepository mealRepo;

    @Autowired
    MealTypeRepository mealTypeRepo;


    @Autowired
    CalorieService calorieService;

    @RequestMapping(value = {"", "/"})
    public String list(Model model, @PageableDefault(size = 5) Pageable pageable) {
        calorieService.countSumAndAv(model);
        model.addAttribute("meals", calorieService.findMeals(pageable));
        return "list_meals";
    }

    @GetMapping("/add")
    public String addPost(Model model) {
        model.addAttribute("addedMeal", new Meal());
        model.addAttribute("types", mealTypeRepo.findAll());
        return "add_meal";
    }

    @PostMapping("/add")
    public String createPost(@ModelAttribute Meal meal) {
        mealRepo.save(meal);
        return "redirect:/meals";
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    public String delete(@PathVariable long id) {
        mealRepo.delete(id);
        return "redirect:/meals";
    }


    @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
    public String edit(@PathVariable long id,
                       Model model) {
        calorieService.findAndEditMeal(id, model);
        model.addAttribute("types", mealTypeRepo.findAll());
        return "edit_meal";
    }

    @RequestMapping(value = "/{id}/edit", method = RequestMethod.POST)
    public String update(@PathVariable long id, @RequestParam("date") String createdAt,
                         @RequestParam("name") String name, @RequestParam("calorie") int calorie, @RequestParam("type") MealType type) {
        calorieService.findAndUpdateMeal(id, name, calorie, createdAt, type);
        return "redirect:/meals";
    }

}
