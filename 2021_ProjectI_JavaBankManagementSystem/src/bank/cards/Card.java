package bank.cards;

import bank.accounts.Account;
import bank.customers.Costumer;
import java.util.ArrayList;

/**
 *
 * @author Castro
 */
public class Card {

    /**
     * unique id card
     */
    private static int id = 0;

    /**
     * card's owner
     */
    private Costumer costumer;

    /**
     * card's list of accounts
     */
    private ArrayList<Account> accountsList;
}
