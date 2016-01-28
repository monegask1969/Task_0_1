package Vegetables;

/**
 * Created by Max on 26.01.2016.
 */
public class Salad extends Vegetables        //салатные
{
    public Salad(double proteins, double calories, double carbs) {
        super(proteins, calories, carbs);
    }

    @Override
    public double Calorie() {
        return super.Calorie();
    }

    @Override
    public void Show_info() {
        System.out.println("Salad. \n Quantity of proteins: " + proteins + "\n" + "Quantity of carbs: " + carbs + "\n" + "Quantity of calories: " + calories);
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
