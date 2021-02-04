package bank.movements;

import bank.accounts.CurrentAccount;

/**
 *
 * @author Castro
 */
public interface Transfer {

    /**
     * transfers between two current accounts
     */
    default public void normalTransfer(double amount, int numRecAcct) {
    }
}
