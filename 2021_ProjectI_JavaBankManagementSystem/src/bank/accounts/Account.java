package bank.accounts;

import bank.customers.Customer;

/**
 *
 * @author Castro
 */
public class Account {

    /**
     * unique id card
     */
    protected static int id = 0;

    /**
     * account's balance
     */
    protected double balance;

    /**
     * owner of account
     */
    protected Customer costumer;

    /**
     * empty constructor
     */
    public Account() {
    }

    /**
     * constructor
     *
     * @param costumer the owner of the account
     */
    public Account(Customer costumer) {
        this.id++;
        this.balance = 0;
        this.costumer = costumer;
    }

    /**
     * id getter
     *
     * @return the account unique id
     */
    public static int getId() {
        return id;
    }

    /**
     * balance getter
     *
     * @return the account's balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * print the account atributes
     *
     * @return the information available of the account
     */
    @Override
    public String toString() {
        return "Account number " + getId() + ", Balance: " + getBalance() + "€.";
    }

}
