package Vegetables;

/**
 * Created by Max on 26.01.2016.
 */
public class Dessert extends Vegetables      //десертные
{
    public Dessert(double proteins, double carbs, double calories) {
        super(proteins,carbs,calories);
       // this.proteins = proteins;
       // this.carbs = carbs;
       // this.calories = calories;
    }

    @Override
    public void Show_info() {
        System.out.println("Dessert. \n Quantity of proteins: " + proteins + "\n" + "Quantity of carbs: " + carbs + "\n" + "Quantity of calories: " + calories);
    }

    @Override
    public double Calorie() {
        return super.Calorie();
    }

    @Override
    public double getProteins() {
        return super.getProteins();
    }

    @Override
    public double getCarbs() {
        return super.getCarbs();
    }

    @Override
    public double getCalories() {
        return super.getCalories();
    }
}
