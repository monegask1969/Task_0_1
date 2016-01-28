package com.company;

import Vegetables.Vegetables;

/**
 * Created by Max on 28.01.2016.
 */
public class Calories_detective {
    public static void calories_detective(Vegetables[] salad, int from, int to)
    {
        System.out.println("Vegetables, which are in the rage: ");
        for (int i = 0; i <salad.length; i++) {
           if(salad[i].getCalories() >= from && salad[i].getCalories() <= to)
           {
               salad[i].Show_info();
           }
        }
    }
}
