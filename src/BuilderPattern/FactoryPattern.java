package BuilderPattern;

import java.util.Scanner;

public class FactoryPattern {

    public static final String Veg_Meal = "Veg Meal";
    public static final String Non_Veg_Meal = "Non-Veg Meal";

    public static void main(String[] args) {

        System.out.println("Select\n1 Veg burger\n2 Non veg burger");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        MealFactory mealFactory = new MealFactory();
        Meal meal = null;
        switch (choice)
        {
            case 1:
                meal = mealFactory.getMeal(Veg_Meal);
                break;
            case 2:
                meal = mealFactory.getMeal(Non_Veg_Meal);
                break;
            default:
                System.out.println("Incorrect Input. Adding veg meal");
                meal = mealFactory.getMeal(Veg_Meal);

        }
        meal.showItems();
        System.out.println("Total Cost: " + meal.getCost());
    }
}
