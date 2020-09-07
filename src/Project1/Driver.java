package Project1;

import java.time.LocalTime;
import java.time.format.*;

public class Driver {

    static double totalProtein = 0;
    DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("HH:mm");

    /*
    Returns the localtime for when the user should eat his next meal
    Chicken: 2 hours
    Beef: 4 hours
    Whey: 2 hours
    Pork: 5 hours
     */
    public LocalTime calculateTimeForNextMeal(FoodWithProtein food) {
        // get hours of how long protein takes to digest
        int hours = food.absorptionTimeInHours;

        // return the date when the user should eat next (when protein is fully digested
        //return LocalTime.now().plusMinutes(1); // uncomment to test, returns the time one minute after current time
        return LocalTime.now().plusHours(hours);
    }

    /*
    Alert the user when his last meal has fully digested the protein
     */
    public void alertUser(LocalTime time) {
        try {
            boolean flag = true;
            while(flag) {
                Thread.sleep(600000); // check every 10 minutes if time has passed
                LocalTime currentTime = LocalTime.now();
                if(currentTime.equals(time) || currentTime.isAfter(time)) {
                    System.out.println("Protein from last meal has fully digested, time to eat again!");
                    flag = false;
                }
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void addProtein(double grams) {
        totalProtein += grams;
    }

    public static void main(String[] args) {
        Driver app = new Driver();
        ChickenProtein mealOne = new ChickenProtein(40, 2, "Chicken");
        System.out.println("Total protein: " + totalProtein);
        //System.out.println(app.calculateTimeForNextMeal(mealOne));
        app.alertUser(app.calculateTimeForNextMeal(mealOne));
    }
}
