package bank.movements;

/**
 *
 * @author Castro
 */
public interface Deposit {

    /**
     * ammount to be deposited in account
     */
    default public void deposit(double amount) {
    }
}
