package com.greenfox.szilvi.calorie.repositories;

import com.greenfox.szilvi.calorie.models.Meal;
import com.greenfox.szilvi.calorie.models.MealType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by ${SzilviaB} on 2017. 01. 09..
 */
public interface MealRepository extends PagingAndSortingRepository<Meal,Long> {



}
