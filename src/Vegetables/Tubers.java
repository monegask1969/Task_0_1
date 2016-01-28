package Vegetables;

/**
 * Created by Max on 26.01.2016.
 */
public class Tubers extends Vegetables       //клубнеплоды
{
    protected Tubers(double proteins, double carbs, double calories)
    {
        super(proteins,calories,carbs);
       // this.proteins = proteins;
        //this.carbs = carbs;
        //this.calories = calories;
    }

    @Override
    public void Show_info() {
        System.out.println("Tubers. \n Quantity of proteins: " + proteins + "\n" + "Quantity of carbs: " + carbs + "\n" + "Quantity of calories: " + calories);
    }
}
