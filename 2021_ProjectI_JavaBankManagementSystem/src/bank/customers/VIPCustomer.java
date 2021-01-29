package bank.customers;

import bank.accounts.CurrentAccount;
import bank.accounts.InvestmentAccount;

/**
 *
 * @author Castro
 */
public class VIPCustomer extends Customer {

    /**
     * account manager of the VIP Client
     */
    private String accountManager;

    /**
     * investment account
     */
    private InvestmentAccount investAccount;

    /**
     * constructor
     *
     * @param name
     * @param phone
     * @param email
     * @param profession
     * @param accountManager
     */
    public VIPCustomer(String name, String phone, String email, String profession,
            String accountManager) {
        super(name, phone, email, profession);
        id++;
        this.accountManager = accountManager;
    }

    /**
     * set the costumer's unique current account, and add it to the list of
     * cards
     *
     * @param currentAccount costumer's current account
     */
    public void setCurrentAccount(CurrentAccount currentAccount) {
        this.currAccount = currentAccount;
        this.accountsList.add(currentAccount);
    }

}
