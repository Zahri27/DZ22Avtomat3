import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        boolean ordering = true;

        DrinksCounter drinksCounter = new DrinksCounter();
        DrinkSelector drinkSelector = new DrinkSelector(drinksCounter);

        while (ordering) {
            System.out.println("Choose a drink (coffee, tea, lemonade, mojito, mineral water, coca cola):");
            userInput = scanner.nextLine().toUpperCase();

            DrinksMachine choice;
            try {
                choice = DrinksMachine.valueOf(userInput.replace(" ", "_"));
                drinkSelector.selectDrink(choice);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.println("Do you want to order another drink? (yes/no)");
            userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("no")) {
                ordering = false;
            }
        }

        System.out.println("You ordered " + drinksCounter.getDrinkCount() + " drinks.");
        System.out.println("Total cost: $" + drinksCounter.getTotalCost());
    }
}
