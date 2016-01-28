package com.company;

import Vegetables.*;

import java.util.Scanner;

import static com.company.Calories_detective.calories_detective;
import static com.company.Sortion.sortion;

public class Main {

    public static void main(String[] args) {
        Vegetables salad[] = new Vegetables[11];
        salad[0] = new Tubers(2,17,73);
        salad[1] = new Spicy(16,305,55);
        salad[2] = new Bulbous(1.1,40,9);
        salad[3] = new Solanaceae(2,40,9);
        salad[4] = new Gourds(0.7,16,3.6);
        salad[5] = new Legumes(5,0.4,14);
        salad[6] = new Crops(9,365,74);
        salad[7] = new Dessert(3.3,47,11);
        salad[8] = new Salad(1.4,15,2.9);
        salad[9] = new Roots(0.9,41,10);
        salad[10] = new Cabbage(3.4,43,9);

        double calorie = 0;
        for (int i = 0; i <salad.length; i++) {
            calorie = calorie + salad[i].Calorie();
        }
        System.out.println("Total calorie:" + calorie);
        System.out.println("Choose the sorting option:");
        System.out.println(" 1.By proteins. \n 2.By carbs. \n 3.By calories.");
        Scanner scanner = new Scanner(System.in);
        int chooser = scanner.nextInt();
        sortion(salad,chooser);

        System.out.println();
        System.out.println("Enter the range of values to find Vegetables's calories.");
        System.out.println("From: ");
        int from = scanner.nextInt();
        System.out.println("To: ");
        int to = scanner.nextInt();
        calories_detective(salad,from,to);
    }
}
