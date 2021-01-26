package bank;

import bank.accounts.CurrentAccount;
import bank.cards.DebitCard;
import bank.customers.Costumer;

/**
 *
 * @author Castro
 */
public class Main {

    public static void main(String[] args) {
        Costumer cost1 = new Costumer("Castro", "936960352", "castro@gmail.com", "Java Dev");
        CurrentAccount currAcct = new CurrentAccount(cost1);
        DebitCard dbtCard = new DebitCard(cost1);
        cost1.setCurrentAccount(currAcct);
        cost1.setDebitCard(dbtCard);
        currAcct.setDebitCard(dbtCard);
        dbtCard.setCurrentAccount(currAcct);

        cost1.showClientInfo();
    }
}
