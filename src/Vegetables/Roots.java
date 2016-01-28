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
        System.out.println("Roots. \n Quantity of proteins: " + proteins + "\n" + "Quantity of carbs: " + carbs + "\n" + "Quantity of calories: " + calories);
    }

    @Override
    public double Calorie() {
        return super.Calorie();
    }
}
