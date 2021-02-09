package bank.accounts;

import bank.cards.CreditCard;
import bank.cards.DebitCard;
import bank.customers.Customer;
import bank.movements.Movements;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Castro
 */
public class CurrentAccount extends Account implements Movements {

    /**
     * debit card that can access the account
     */
    protected DebitCard debitCard;

    /**
     * credit card that can access the account (among other things)
     */
    protected CreditCard creditCard;

    /**
     * account's list of cards that can access the account
     */
    protected List<DebitCard> cardsList = new ArrayList<>();

    /**
     * stores the unique customer's current account
     */
    protected List<CurrentAccount> uniqueCurrentAccount = new ArrayList<>();

    public CurrentAccount() {
    }

    /**
     * constructor
     *
     * @param costumer the owner of the account
     */
    public CurrentAccount(Customer costumer) {
        super(costumer);
        uniqueCurrentAccount.add(this);
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

    /**
     * set credit card that controls the account (among other thins) and add it
     * to the list of cards
     *
     * @param crdCard
     */
    public void setCreditCard(CreditCard crdCard) {
        this.creditCard = crdCard;
        this.cardsList.add(crdCard);
    }

    /**
     * withdraw ammount on an account
     */
    public void withdraw(double amount) {
        do {
            if (amount <= this.balance) {
                this.balance -= amount;
            } else {
                System.out.println("Your account doesn't have enough balance ("
                        + amount + " €) to execute the withdrawal");
            }
        } while (!(amount <= this.balance));
    }

    /**
     * transfers between two current accounts
     *
     * @param amount quantity of money to be transfered
     * @param idRecAcct account id of the Account that will recieve the amount
     */
    public void normalTransfer(double amount, int idRecAcct) {
        do {
            if (amount <= this.balance) {
                this.balance -= amount;
                for (int i = 0; i < Account.generalAccountsList.size(); i++) {
                    if (generalAccountsList.get(i).getId() == idRecAcct) {
                        double destinyAcctBalance = generalAccountsList.get(i).getBalance();
                        destinyAcctBalance += amount;
                        generalAccountsList.get(i).addBalance(balance);
                    }
                }
            } else {
                System.out.println("Your account doesn't have enough balance ("
                        + amount + " €) to execute the withdrawal");
                this.balance += amount;
            }
        } while (!(amount <= this.balance));
    }

    /**
     * ammount to be deposited in account
     */
    @Override
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Amount deposited: " + amount + "€.");
    }
}
