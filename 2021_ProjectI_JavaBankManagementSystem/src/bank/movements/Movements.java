package bank.movements;

/**
 *
 * @author Castro
 */
public interface Movements extends Transfer, Deposit {

    /**
     * withdraw ammount on an account
     *
     * @param amount quantity of money to be withdrawn
     */
    default public void withdraw(double amount) {
    }
}
