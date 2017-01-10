package com.greenfox.szilvi.calorie.services;

import com.greenfox.szilvi.calorie.models.Meal;
import com.greenfox.szilvi.calorie.models.MealType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by ${SzilviaB} on 2017. 01. 09..
 */
public interface MealRepository extends CrudRepository<Meal,Long>{



}
