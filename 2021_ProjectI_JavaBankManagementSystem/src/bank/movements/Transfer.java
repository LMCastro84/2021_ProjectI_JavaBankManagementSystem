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
    public void normalTransfer();

    /**
     * transfers between diferent type of accounts
     */
    public void difAcctTypeTransfer();
}
