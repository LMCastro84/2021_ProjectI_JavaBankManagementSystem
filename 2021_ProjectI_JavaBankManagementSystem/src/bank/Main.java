package bank;

import bank.accounts.CurrentAccount;
import bank.cards.CreditCard;
import bank.cards.DebitCard;
import bank.customers.Customer;
import bank.customers.VIPCustomer;
import java.util.Scanner;

/**
 *
 * @author Castro
 */
public class Main {

    public static void main(String[] args) {
        int option = 0;
        Scanner in = new Scanner(System.in);
        do {
            Menu.showMainMenu();

            option = in.nextInt();
            switch (option) {
                case 1:
                    option = 0;
                    Menu.showCustomerMenu();
                    option = in.nextInt();
                    switch (option) {
                        case 1:
                            String name,
                             phone,
                             email,
                             profession;
                            System.out.println("New Regular Customer");
                            System.out.print("Insert Customer's name: ");
                            name = in.nextLine();
                            System.out.print("Insert Customer's phone: ");
                            phone = in.nextLine();
                            System.out.print("Insert Customer's email: ");
                            email = in.nextLine();
                            System.out.print("Insert Customer's profession: ");
                            profession = in.nextLine();
                            Customer newCustomer = new Customer(name, phone, email, profession);
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Option 2;");
                    break;
                case 3:
                    System.out.println("Option 3;");
                    break;
                case 4:
                    System.out.println("Option 4;");
                    break;
                case 5:
                    System.out.println("Option 5;");
                    break;
                case 6:
                    System.out.println("Option 6;");
            }
        } while (option != 6);

        Customer cost1 = new Customer("Castro", "936960352", "castro@gmail.com", "Java Dev");
        CurrentAccount currAcct = new CurrentAccount(cost1);
        DebitCard dbtCard = new DebitCard(cost1);
        cost1.setCurrentAccount(currAcct);
        cost1.setDebitCard(dbtCard);
        currAcct.setDebitCard(dbtCard);
        dbtCard.setCurrentAccount(currAcct);
        CreditCard creditCard1 = new CreditCard(cost1, 50);
        creditCard1.setCurrentAccount(currAcct);
        cost1.showClientInfo();

        System.out.println("");
        System.out.println("");
        Customer cost2 = new VIPCustomer("Silva", "986966418", "marisa@gmail.com", "BNP", "Castro Manager");
        CurrentAccount currAcct2 = new CurrentAccount(cost2);
        DebitCard dbtCard2 = new DebitCard(cost2);
        cost2.setCurrentAccount(currAcct2);
        cost2.setDebitCard(dbtCard2);
        currAcct2.setDebitCard(dbtCard2);
        dbtCard2.setCurrentAccount(currAcct2);
        cost2.showClientInfo();

        System.out.println("\nTests:");

    }
}
