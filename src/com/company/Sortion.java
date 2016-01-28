package com.company;

import Vegetables.Vegetables;

import java.util.Objects;

/**
 * Created by Max on 28.01.2016.
 */
public class Sortion {
    public static void sortion(Vegetables[] salad, int chooser)
    {
        if(chooser == 1)
        {
            for (int i = 0; i <salad.length ; i++) {
                for (int j = 0; j <salad.length-i-1 ; j++) {
                    if(salad[j].getProteins() > salad[j+1].getProteins())
                    {
                        Vegetables t = salad[j];
                        salad[j] = salad[j + 1];
                        salad[j + 1] = t;
                    }
                }
            }
            System.out.println("Vegetables were sorted by protein:");
            for (int i = 0; i < salad.length; i++) {
                salad[i].Show_info();
            }
        }
        if(chooser == 2)
        {
            for (int i = 0; i <salad.length ; i++) {
                for (int j = 0; j <salad.length-i-1 ; j++) {
                    if(salad[j].getCarbs() > salad[j+1].getCarbs())
                    {
                        Vegetables t = salad[j];
                        salad[j] = salad[j + 1];
                        salad[j + 1] = t;
                    }
                }
            }
            System.out.println("Vegetables were sorted by carbs:");
            for (int i = 0; i < salad.length; i++) {
                salad[i].Show_info();
            }
        }
        if(chooser == 3)
        {
            for (int i = 0; i <salad.length ; i++) {
                for (int j = 0; j <salad.length-i-1 ; j++) {
                    if(salad[j].getCalories() > salad[j+1].getCalories())
                    {
                        Vegetables t = salad[j];
                        salad[j] = salad[j + 1];
                        salad[j + 1] = t;
                    }
                }
            }
            System.out.println("Vegetables were sorted by calories:");
            for (int i = 0; i < salad.length; i++) {
                salad[i].Show_info();
            }
        }
    }
}
