package Vegetables;

/**
 * Created by Max on 28.01.2016.
 */
public abstract class Vegetables{
        double proteins = 0;
        double carbs = 0;
        double calories = 0;
    double calorie = 0;

    public Vegetables(double proteins, double calories, double carbs) {
        this.proteins = proteins;
        this.calories = calories;
        this.carbs = carbs;
    }

    public double Calorie()
    {
        calorie += calories;
        return calorie;
    }

    public double getProteins() {
        return proteins;
    }

    public double getCarbs() {
        return carbs;
    }

    public double getCalories() {
        return calories;
    }

    public abstract void Show_info();
}
