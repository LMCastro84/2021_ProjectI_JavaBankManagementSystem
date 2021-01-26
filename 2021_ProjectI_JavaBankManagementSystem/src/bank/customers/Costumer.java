package bank.customers;

import bank.accounts.Account;
import bank.accounts.CurrentAccount;
import bank.cards.DebitCard;
import java.util.ArrayList;

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
    private ArrayList<Account> accountsList;

    /**
     * customer's debit card
     */
    private DebitCard debitCard;

    /**
     * customer's list of cards
     */
    private ArrayList<DebitCard> cardsList;

    CurrentAccount currAccount = new CurrentAccount();
//    DebitCard debCard = new DebitCard();

    public Costumer(String name, String phone, String email, String profession) {
        id++;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.profession = profession;
//        this.currentAccount = currAccount.newCurrentAccount(); // para o main
        accountsList.add(currentAccount);
//        this.debitCard = debCard.newDebitCard(); //para o main
        cardsList.add(debitCard);

    }

    /**
     * set the costumer's unique current account
     * @param currentAccount costumer's current account
     */
    public void setCurrentAccount(CurrentAccount currentAccount) {
        this.currentAccount = currentAccount;
    }

    /**
     * set a costumer's debit card
     * @param debitCard 
     */
    public void setDebitCard(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

}
