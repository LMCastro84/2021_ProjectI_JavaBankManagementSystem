package bank.accounts;

import bank.customers.Customer;
import bank.movements.Deposit;
import bank.movements.Transfer;

/**
 *
 * @author Castro
 */
public class SavingsAccount extends Account implements Transfer, Deposit {

    /**
     * interest to be setted when credit card is created
     */
    private double interest;

    /**
     * empty constructor
     */
    public SavingsAccount() {
    }

    /**
     * constructor
     *
     * @param costumer the owner of the account
     * @param interest of the savings account
     */
    public SavingsAccount(Customer costumer, double interest) {
        super(costumer);
        this.interest = interest;
        Account.generalAccountsList.add(this);
    }

    /**
     * transfers between two current accounts
     */
    @Override
    public void transferBetween(double amount, int numRecAcct) {
    }

    /**
     * mmount to be deposited in account
     */
    @Override
    public void deposit(double amount) {
    }

}
