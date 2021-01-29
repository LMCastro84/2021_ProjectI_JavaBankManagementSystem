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
        
        
        Costumer cost2 = new Costumer("Silva", "986966418", "marisa@gmail.com", "BNP");
        CurrentAccount currAcct2 = new CurrentAccount(cost2);
        DebitCard dbtCard2 = new DebitCard(cost2);
        cost2.setCurrentAccount(currAcct2);
        cost2.setDebitCard(dbtCard2);
        currAcct2.setDebitCard(dbtCard2);
        dbtCard2.setCurrentAccount(currAcct2);
        System.out.println("");

        cost2.showClientInfo();
    }
}
