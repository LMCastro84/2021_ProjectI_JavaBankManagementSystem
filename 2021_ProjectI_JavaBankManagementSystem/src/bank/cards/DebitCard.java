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
     * type of card
     */
    private String cardType = "Debit";

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

    /**
     * constructor
     *
     * @param costumer
     */
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

    /**
     * id getter
     *
     * @return the card unique id
     */
    public static int getId() {
        return id;
    }

    /**
     * print the card atributes
     *
     * @return information available of the card
     */
    @Override
    public String toString() {
        return cardType + " Card number " + getId() + ".";
    }
}
