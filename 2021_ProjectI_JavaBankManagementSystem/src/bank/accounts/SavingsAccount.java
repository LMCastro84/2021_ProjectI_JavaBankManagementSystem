package bank.accounts;

import bank.customers.Customer;

/**
 *
 * @author Castro
 */
public class SavingsAccount extends Account {

    /**
     * interest to be setted when credit card is created
     */
    private double interest;

    /**
     * constructor
     *
     * @param costumer the owner of the account
     * @param interest of the savings account
     */
    public SavingsAccount(Customer costumer, double interest) {
        super(costumer);
        this.interest = interest;
    }

}
