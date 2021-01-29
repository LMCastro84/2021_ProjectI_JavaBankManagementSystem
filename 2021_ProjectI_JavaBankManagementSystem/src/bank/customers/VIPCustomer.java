package bank.customers;

import bank.accounts.CurrentAccount;
import bank.accounts.InvestmentAccount;
import bank.cards.DebitCard;

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
     * accounts
     *
     * @param currentAccount
     */
    @Override
    public void setCurrentAccount(CurrentAccount currentAccount) {
        this.currAccount = currentAccount;
        this.accountsList.add(currentAccount);
    }

    /**
     * set debit card that owned by costumer, and add it to the list of cards
     *
     * @param dbtCard
     */
    @Override
    public void setDebitCard(DebitCard dbtCard) {
        this.debitCard = dbtCard;
        this.cardsList.add(dbtCard);
    }

    /**
     * print all the information available of the client
     */
    @Override
    public void showClientInfo() {
        System.out.println("Client number: " + id);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Profession: " + profession);
        System.out.println("Account Manager: " + accountManager);
        System.out.println("List of Accounts: \n Client has " + this.accountsList.size()
                + " accounts:\n" + this.accountsList.toString());
        System.out.print("List of Cards: " + this.cardsList.toString());
    }

}
