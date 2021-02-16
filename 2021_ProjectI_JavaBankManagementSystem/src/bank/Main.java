package bank;

import bank.accounts.CurrentAccount;
import bank.cards.CreditCard;
import bank.cards.DebitCard;
import bank.customers.Customer;
import bank.customers.VIPCustomer;

/**
 *
 * @author Castro
 */
public class Main {

    public static void main(String[] args) {
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
