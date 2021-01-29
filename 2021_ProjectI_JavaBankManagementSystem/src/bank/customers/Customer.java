package bank.customers;

import bank.accounts.Account;
import bank.accounts.CurrentAccount;
import bank.cards.CreditCard;
import bank.cards.DebitCard;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Castro
 */
public class Customer {

    /**
     * unique id customer
     */
    public static int id = 0;

    /**
     * customer's name
     */
    protected String name;

    /**
     * customer's phone'
     */
    protected String phone;

    /**
     * customer's email
     */
    protected String email;

    /**
     * customer's profession
     */
    protected String profession;

    /**
     * customer's current account
     */
    protected CurrentAccount currAccount = new CurrentAccount();

    /**
     * customer's list of accounts
     */
    protected List<Account> accountsList = new ArrayList<>();

    /**
     * customer's debit card
     */
    protected DebitCard debitCard;

    /**
     * customer's credit card
     */
    protected CreditCard creditCard;

    /**
     * customer's list of cards
     */
    protected List<DebitCard> cardsList = new ArrayList<>();

    /**
     * contructor
     *
     * @param name
     * @param phone
     * @param email
     * @param profession
     */
    public Customer(String name, String phone, String email, String profession) {
        id++;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.profession = profession;
    }

    /**
     * set the costumer's unique current account, and add it to the list of
     * accounts
     *
     * @param currentAccount costumer's current account
     */
    public void setCurrentAccount(CurrentAccount currentAccount) {
        this.currAccount = currentAccount;
        this.accountsList.add(currentAccount);
    }

    /**
     * set debit card owned by costumer, and add it to the list of cards
     *
     * @param dbtCard
     */
    public void setDebitCard(DebitCard dbtCard) {
        this.debitCard = dbtCard;
        this.cardsList.add(dbtCard);
    }

    /**
     * set credit card owned by costumer, and add it to the list of cards
     *
     * @param crdCard
     */
    public void setCreditCard(CreditCard crdCard) {
        this.creditCard = crdCard;
        this.cardsList.add(crdCard);
    }

    /**
     * print all the information available of the client
     */
    public void showClientInfo() {
        System.out.println("Client number: " + id);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Profession: " + profession);
        System.out.println("List of Accounts: \n Client has " + this.accountsList.size()
                + " accounts:\n" + this.accountsList.toString());
        System.out.print("List of Cards: " + this.cardsList.toString());
    }
}
