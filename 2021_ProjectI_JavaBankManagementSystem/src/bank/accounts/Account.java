package bank.accounts;

import bank.customers.Customer;
import java.util.ArrayList;
import java.util.List;

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
    protected Customer customer;

    /**
     * list of all the accounts in the bank
     */
    public static List<Account> generalAccountsList = new ArrayList<>();

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
        id++;
        this.balance = 0;
        this.customer = costumer;
    }

    /**
     * id getter
     *
     * @return the account unique id
     */
    public int getId() {
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
     * set the new balance, by adding an amount
     *
     * @param balance
     */
    public void addBalance(double balance) {
        this.balance += balance;
    }

    /**
     * set the new balance, by subtracting an amount
     *
     * @param balance
     */
    public void subtractBalance(double balance) {
        this.balance -= balance;
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
