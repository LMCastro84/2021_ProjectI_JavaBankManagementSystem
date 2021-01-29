package bank.accounts;

import bank.customers.Customer;

/**
 *
 * @author Castro
 */
public class TermAccount extends Account {

    /**
     * ammount deposited to allow the term account to be created
     */
    private double termDeposit;

    /**
     * constructor
     *
     * @param costumer the owner of the account
     * @param termDeposit of the term account
     */
    public TermAccount(Customer costumer, double termDeposit) {
        super(costumer);
        id++;
        this.termDeposit = termDeposit;
    }

}
