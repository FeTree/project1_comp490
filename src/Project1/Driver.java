package Project1;

import java.time.LocalTime;
import java.time.format.*;

public class Driver {

    double totalProtein;
    DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("HH:mm");

    public LocalTime calculateTimeForNextMeal(FoodWithProtein food) {
        System.out.println(food.name);
        System.out.println(LocalTime.now().format(formatDate));
        return LocalTime.now();
    }

    public void alertUser(LocalTime time) {

    }
    public static void main(String[] args) {
        Driver app = new Driver();
        ChickenProtein mealOne = new ChickenProtein(40, 2, "Chicken");

        System.out.println(app.calculateTimeForNextMeal(mealOne));
    }
}
