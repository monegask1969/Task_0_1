package com.company;

import Vegetables.Vegetables;

public class Main {

    public static void main(String[] args) {
        Vegetables salad[] = new Vegetables[11];
        salad[0] = new Vegetables.Tubers(2,17,73);
        salad[1] = new Vegetables.Spicy(16,305,55);
        salad[2] = new Vegetables.Bulbous(1.1,40,9);
        salad[3] = new Vegetables.Solanaceae(2,40,9);
        salad[4] = new Vegetables.Gourds(0.7,16,3.6);
        salad[5] = new Vegetables.Legumes(5,0.4,14);
        salad[6] = new Vegetables.Crops(9,365,74);
        salad[7] = new Vegetables.Dessert(3.3,47,11);
        salad[8] = new Vegetables.Salad(1.4,15,2.9);
        salad[9] = new Vegetables.Roots(0.9,41,10);
        salad[10] = new Vegetables.Cabbage(3.4,43,9);

        System.out.print("Total calorie:");
        double calorie = 0;
        for (int i = 0; i <salad.length; i++) {
            calorie = calorie + salad[i].Calorie();
        }
    }
}
