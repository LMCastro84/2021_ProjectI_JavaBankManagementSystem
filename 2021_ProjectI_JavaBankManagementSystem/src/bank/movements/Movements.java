package bank.movements;

/**
 *
 * @author Castro
 */
public interface Movements extends Transfer, Deposit {

    /**
     * withdraw ammount on an account
     */
    default public void withdraw(double amount) {
    }
}
