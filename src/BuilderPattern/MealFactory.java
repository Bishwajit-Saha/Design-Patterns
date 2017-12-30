package BuilderPattern;

public class MealFactory {

    public Meal getMeal(String mealName)
    {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = null;

        if(mealName == "Veg Meal") {
            meal = mealBuilder.prepareVegMeal();
            System.out.println("Don't kill innocent animals");
        }
        else if(mealName == "Non-Veg Meal") {
            meal = mealBuilder.prepareNonVegMeal();
            System.out.println("\n\nEat animals save grass");
        }

        return meal;
    }
}
