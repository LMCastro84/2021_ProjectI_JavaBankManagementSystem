package bank.customers;

import bank.accounts.Account;
import bank.accounts.CurrentAccount;
import bank.cards.DebitCard;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Castro
 */
public class Costumer {

    /**
     * unique id customer
     */
    public static int id = 0;

    /**
     * customer's name
     */
    private String name;

    /**
     * customer's phone'
     */
    private String phone;

    /**
     * customer's email
     */
    private String email;

    /**
     * customer's profession
     */
    private String profession;

    /**
     * customer's current account
     */
    private CurrentAccount currentAccount;

    /**
     * customer's list of accounts
     */
    private List<Account> accountsList = new ArrayList<>();

    /**
     * customer's debit card
     */
    private DebitCard debitCard;

    /**
     * customer's list of cards
     */
    private List<DebitCard> cardsList = new ArrayList<>();

    CurrentAccount currAccount = new CurrentAccount();
//    DebitCard debCard = new DebitCard();

    public Costumer(String name, String phone, String email, String profession) {
        id++;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.profession = profession;
    }

    /**
     * set the costumer's unique current account, and add it to the list of
     * cards
     *
     * @param currentAccount costumer's current account
     */
    public void setCurrentAccount(CurrentAccount currentAccount) {
        this.currentAccount = currentAccount;
        this.accountsList.add(currAccount);
    }

    /**
     * set debit card that owned by costumer, and add it to the list of cards
     *
     * @param dbtCard
     */
    public void setDebitCard(DebitCard dbtCard) {
        this.debitCard = dbtCard;
        this.cardsList.add(dbtCard);
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
