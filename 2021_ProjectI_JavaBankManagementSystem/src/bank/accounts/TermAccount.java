package bank.accounts;

import bank.customers.Customer;
import bank.movements.Transfer;

/**
 *
 * @author Castro
 */
public class TermAccount extends Account implements Transfer {

    /**
     * ammount deposited to allow the term account to be created
     */
    private double termDeposit;

    /**
     * empty constructor
     */
    public TermAccount() {
    }

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

    /**
     * transfers between two current accounts
     */
    @Override
    public void normalTransfer(double amount, int numRecAcct) {
    }
}
