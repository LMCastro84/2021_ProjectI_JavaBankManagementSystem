package bank.cards;

import bank.accounts.Account;
import bank.accounts.CurrentAccount;
import bank.customers.Customer;
import bank.movements.Movements;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Castro
 */
public class DebitCard implements Movements {

    /**
     * unique id card
     */
    protected static int id = 0;

    /**
     * type of card
     */
    protected String cardType = "Debit";

    /**
     * card's owner
     */
    protected Customer costumer;

    /**
     * current account controled by the debit card
     */
    protected CurrentAccount currentAccount;

    /**
     * card's list of accounts
     */
    protected List<Account> accountsList = new ArrayList<>();

    /**
     * empty constructor
     */
    public DebitCard() {
    }

    /**
     * constructor
     *
     * @param costumer
     */
    public DebitCard(Customer costumer) {
        id++;
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

    /**
     * withdraw ammount on an account
     */
    @Override
    public void withdraw() {
    }

    /**
     * transfers between two current accounts
     */
    @Override
    public void normalTransfer() {
    }

    /**
     * ammount to be deposited in account
     */
    @Override
    public void deposit() {
    }
}
