package bank.cards;

import bank.accounts.Account;
import bank.accounts.CurrentAccount;
import bank.customers.Costumer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Castro
 */
public class DebitCard {

    /**
     * unique id card
     */
    private static int id = 0;

    /**
     * card's owner
     */
    private Costumer costumer;

    /**
     * current account controled by the debit card
     */
    private CurrentAccount currentAccount;

    /**
     * card's list of accounts
     */
    private List<Account> accountsList = new ArrayList<>();

    public DebitCard(Costumer costumer) {
        this.id++;
        this.costumer = costumer;
    }

    /**
     * set the costumer's unique current account controled by the debit card
     *
     * @param currentAccount current account of card's owner
     */
    public void setCurrentAccount(CurrentAccount currentAccount) {
        this.currentAccount = currentAccount;
    }
}
