package bank.movements;

import bank.accounts.CurrentAccount;

/**
 *
 * @author Castro
 */
public interface Transfer {

    /**
     * transfers between two current accounts
     *
     * @param amount quantity of money to be transfered
     * @param numRecAcct account id of the Account that will recieve the amount
     */
    default public void normalTransfer(double amount, int numRecAcct) {
    }
}
