package bank.accounts;

import bank.cards.DebitCard;
import bank.customers.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Castro
 */
public class CurrentAccount extends Account {

    /**
     * debit card that can access the account
     */
    private DebitCard debitCard;

    /**
     * account's list of cards that can access the account
     */
    private List<DebitCard> cardsList = new ArrayList<>();

    public CurrentAccount() {
    }

    /**
     * constructor
     *
     * @param costumer the owner of the account
     */
    public CurrentAccount(Customer costumer) {
        super(costumer);
        id++;
    }

    /**
     * set debit card that controls the account, and add it to the list of cards
     *
     * @param debitCard
     */
    public void setDebitCard(DebitCard debitCard) {
        this.debitCard = debitCard;
        this.cardsList.add(debitCard);
    }

}
