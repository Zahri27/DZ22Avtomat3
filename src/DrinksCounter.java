public class DrinksCounter {
    private int drinkCount = 0;
    private double totalCost = 0.0;

    public void addDrink(double price) {
        drinkCount++;
        totalCost += price;
    }

    public int getDrinkCount() {
        return drinkCount;
    }

    public double getTotalCost() {
        return totalCost;
    }
}
