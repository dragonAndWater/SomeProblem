package designPatterns.builderDemo;

import designPatterns.builderDemo.Model.Meal;
import designPatterns.builderDemo.Service.MealService;


public class MealBuderDemo {


    public static void main(String[] args) {
        MealService mealSer = new MealService();
        Meal meal = mealSer.prepareCheckinMeal();
        System.out.println(meal.showItems());
        System.out.println(meal.getSumCost());

    }
}
