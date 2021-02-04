package bank.movements;

/**
 *
 * @author Castro
 */
public interface Deposit {

    /**
     * ammount to be deposited in account
     *
     * @param amount quantity of money to be deposited
     */
    default public void deposit(double amount) {
    }
}
