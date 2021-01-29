package bank.accounts;

import bank.customers.Customer;

/**
 *
 * @author Castro
 */
public class InvestmentAccount extends Account {

    /**
     * the associated cost to maintain the account
     */
    private double associatedCost;

    /**
     * constructor
     *
     * @param costumer the owner of the account
     */
    public InvestmentAccount(Customer costumer) {
        super(costumer);
        this.associatedCost = 5;
    }

}
