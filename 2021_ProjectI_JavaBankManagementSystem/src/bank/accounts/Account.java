package bank.accounts;

import bank.customers.Costumer;

/**
 *
 * @author Castro
 */
public class Account {

    /**
     * unique id card
     */
    private static int id = 0;

    /**
     * account's balance
     */
    private double balance;

    /**
     * owner of account
     */
    private Costumer costumer;

    public Account() {
    }

    /**
     * constructor
     *
     * @param costumer the owner of the account
     */
    public Account(Costumer costumer) {
        this.id++;
        this.balance = 0;
        this.costumer = costumer;
    }

}
