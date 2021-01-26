package bank.accounts;

import bank.cards.DebitCard;
import bank.customers.Costumer;
import java.util.ArrayList;

/**
 *
 * @author Castro
 */
public class CurrentAccount extends Account {

    /**
     * account's list of cards
     */
    private ArrayList<DebitCard> cardsList;

    public CurrentAccount() {
    }

    /**
     * constructor
     *
     * @param costumer the owner of the account
     */
    public CurrentAccount(Costumer costumer) {
        super(costumer);
    }

}
