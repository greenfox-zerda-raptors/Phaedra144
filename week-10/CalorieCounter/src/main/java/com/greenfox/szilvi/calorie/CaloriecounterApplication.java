package com.greenfox.szilvi.calorie;

import com.greenfox.szilvi.calorie.repositories.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CaloriecounterApplication implements CommandLineRunner {

	@Autowired
	private MealRepository mealRepository;

	public static void main(String[] args) {

		SpringApplication.run(CaloriecounterApplication.class, args);

	}


	@Override
	public void run(String... args) throws Exception {

//		ArrayList<String> meals = new ArrayList<>(
//				Arrays.asList("Toast", "Broccoli","Hamburger", "Chocolate", "Ravioli", "Gyros"));
//		ArrayList<Integer> calories = new ArrayList<>(
//				Arrays.asList(120, 50, 350, 250, 400, 320));
//		ArrayList<MealType> types = new ArrayList<>(
//				Arrays.asList(new MealType(0), new MealType(1), new MealType(2), new MealType(3), new MealType(4), new MealType(5)));
//
//		for (int i = 0; i <= 5; i++) {
//			mealRepository.save(new Meal(meals.get(i), calories.get(i),types.get(i)));
//		}
	}
}
