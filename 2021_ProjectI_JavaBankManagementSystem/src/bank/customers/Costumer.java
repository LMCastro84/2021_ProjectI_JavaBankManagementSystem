package bank.customers;

import java.util.ArrayList;

/**
 *
 * @author Castro
 */
public class Costumer {

    /**
     * unique id customer
     */
    private static int id = 0;

    /**
     * customer's name
     */
    private String name;

    /**
     * customer's phone'
     */
    private String phone;

    /**
     * customer's email
     */
    private String email;

    /**
     * customer's profession
     */
    private String profession;

    /**
     * customer's current account
     */
    private Account currentAccount;

    /**
     * customer's list of accounts
     */
    private ArrayList<Account> accountsList;

    /**
     * customer's debit card
     */
    private Card debitCard;

    /**
     * customer's list of cards
     */
    private ArrayList<Card> cardsList;
}
