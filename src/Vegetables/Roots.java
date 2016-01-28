package Vegetables;

/**
 * Created by Max on 26.01.2016.
 */
public class Roots extends Vegetables    //корнеплоды
{
    public Roots(double proteins, double carbs, double calories) {
        super(proteins,carbs,calories);
    }

    @Override
    public void Show_info() {
        System.out.println("Roots.\n Quantity of proteins: " + proteins + ". " + "Quantity of carbs: " + carbs + "Quantity of calories: " + calories);
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
