package bank.cards;

import bank.customers.Customer;

/**
 *
 * @author Castro
 */
public class CreditCard extends DebitCard {

    /**
     * ceiling to be setted when credit card is created
     */
    private double ceiling;

    /**
     * empty constructor
     */
    public CreditCard() {
    }

    /**
     * constructor
     *
     * @param costumer owner of the credit card
     * @param ceiling of the credit card
     */
    public CreditCard(Customer costumer, double ceiling) {
        super(costumer);
        id++;
        cardType = "Credit";
        this.ceiling = ceiling;
    }

}
