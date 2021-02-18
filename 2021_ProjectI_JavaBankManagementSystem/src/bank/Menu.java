package bank;

/**
 *
 * @author Castro
 */
public class Menu {

    /**
     * shows the welcome/main menu
     */
    public static void showMainMenu() {
        System.out.println("Welcome!");
        System.out.println("Please enter an option:");
        System.out.println("1 - Create New Customer;");
        System.out.println("2 - List all Clients;");
        System.out.println("3 - Client options;");
        System.out.println("4 - Select a Card;");
        System.out.println("5 - Advance one month;");
        System.out.println("6 - Exit.");
    }

    public static void showCustomerMenu() {
        System.out.println("1 - New Regular Customer;");
        System.out.println("2 - New VIP Customer;");
        System.out.println("3 - Exit.");
    }
}
