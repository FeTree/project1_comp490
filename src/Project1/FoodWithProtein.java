package Project1;

public class FoodWithProtein {
    // Globals
    double proteinInGrams;
    int absorptionTimeInHours;
    String name;

    public FoodWithProtein(double proteinInGrams, int absorptionTimeInHours, String name) {
        System.out.println("Adding meal...");
        this.proteinInGrams = proteinInGrams;
        this.absorptionTimeInHours = absorptionTimeInHours;
        this.name = name;
        Driver.addProtein(proteinInGrams);
    }
}
