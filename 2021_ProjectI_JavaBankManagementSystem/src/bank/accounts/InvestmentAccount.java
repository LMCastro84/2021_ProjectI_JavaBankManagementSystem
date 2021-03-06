package bank.accounts;

import bank.customers.Customer;
import bank.movements.Transfer;

/**
 *
 * @author Castro
 */
public class InvestmentAccount extends Account implements Transfer {

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
        Account.generalAccountsList.add(this);
    }

    /**
     * transfers between two current accounts
     */
    @Override
    public void transferBetween(double amount, int numRecAcct) {
    }
}
