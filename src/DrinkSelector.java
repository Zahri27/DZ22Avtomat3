public class DrinkSelector {
    private final DrinksCounter drinksCounter;

    public DrinkSelector(DrinksCounter drinksCounter) {
        this.drinksCounter = drinksCounter;
    }

    public void selectDrink(DrinksMachine choice) {
        System.out.println("Preparing " + choice.name().toLowerCase().replace("_", " "));
        drinksCounter.addDrink(choice.getPrice());
    }
}
