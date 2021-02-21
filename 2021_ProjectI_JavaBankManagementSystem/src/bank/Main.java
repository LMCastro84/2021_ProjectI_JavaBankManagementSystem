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
        String name;
        String phone;
        String email;
        String profession;
        String accountManager;
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
                            System.out.println("New Regular Customer");
                            System.out.print("Insert Customer's name: ");
                            name = in.nextLine();
                            name = in.nextLine();
                            System.out.print("Insert Customer's phone: ");
                            phone = in.nextLine();
                            System.out.print("Insert Customer's email: ");
                            email = in.nextLine();
                            System.out.print("Insert Customer's profession: ");
                            profession = in.nextLine();
                            Customer newCustomer = new Customer(name, phone, email, profession);
                            CurrentAccount currAcct = new CurrentAccount(newCustomer);
                            DebitCard dbtCard = new DebitCard(newCustomer);
                            newCustomer.setCurrentAccount(currAcct);
                            newCustomer.setDebitCard(dbtCard);
                            currAcct.setDebitCard(dbtCard);
                            dbtCard.setCurrentAccount(currAcct);
                            CreditCard creditCard = new CreditCard(newCustomer, 50);
                            creditCard.setCurrentAccount(currAcct);
                            newCustomer.showClientInfo();
                            break;
                        case 2:
                            System.out.println("New VIP Customer");
                            System.out.print("Insert Customer's name: ");
                            name = in.nextLine();
                            name = in.nextLine();
                            System.out.print("Insert Customer's phone: ");
                            phone = in.nextLine();
                            System.out.print("Insert Customer's email: ");
                            email = in.nextLine();
                            System.out.print("Insert Customer's profession: ");
                            profession = in.nextLine();
                            System.out.println("Insert Customer's Account Manager");
                            accountManager = in.nextLine();
                            VIPCustomer newVIPCustomer = new VIPCustomer(name, phone, email, profession, accountManager);
                            CurrentAccount vipCurrAcct = new CurrentAccount(newVIPCustomer);
                            DebitCard vipDbtCard = new DebitCard(newVIPCustomer);
                            newVIPCustomer.setCurrentAccount(vipCurrAcct);
                            newVIPCustomer.setDebitCard(vipDbtCard);
                            vipCurrAcct.setDebitCard(vipDbtCard);
                            vipDbtCard.setCurrentAccount(vipCurrAcct);
                            CreditCard vipCreditCard = new CreditCard(newVIPCustomer, 50);
                            vipCreditCard.setCurrentAccount(vipCurrAcct);
                            newVIPCustomer.showClientInfo();
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
    }
}
