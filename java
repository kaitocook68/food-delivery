import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] menu = {"Pizza", "Burger", "Pasta", "Sandwich"};
        double[] prices = {250.0, 150.0, 200.0, 100.0};

        System.out.println("Welcome to the Food Delivery System!");
        System.out.println("Here is our menu:");

        // Display menu
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - ₹" + prices[i]);
        }

        System.out.println("\nEnter the number of items you want to order:");
        int itemCount = scanner.nextInt();

        double totalCost = 0.0;

        // Take orders
        for (int i = 0; i < itemCount; i++) {
            System.out.println("Enter the item number for item " + (i + 1) + ":");
            int itemNumber = scanner.nextInt();

            if (itemNumber >= 1 && itemNumber <= menu.length) {
                totalCost += prices[itemNumber - 1];
                System.out.println(menu[itemNumber - 1] + " added to your order.");
            } else {
                System.out.println("Invalid item number. Please try again.");
                i--; // Retry the current item
            }
        }

        System.out.println("\nYour total cost is: ₹" + totalCost);
        System.out.println("Thank you for ordering! Your food will be delivered shortly.");
        scanner.close();
    }
}
