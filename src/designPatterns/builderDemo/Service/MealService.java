package designPatterns.builderDemo.Service;

import designPatterns.builderDemo.Interface.Item;
import designPatterns.builderDemo.Model.*;

/**
 * @Author longtao
 * @Date 2020/1/8
 * @Describe 创建
 **/
public class MealService {
    public static Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public static Meal prepareCheckinMeal() {
        Meal meal = new Meal();
        meal.addItem(new CheckinBurger());
        meal.addItem(new Pepsi());
        return meal;

    }
}
