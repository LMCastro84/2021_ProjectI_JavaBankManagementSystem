package bank.customers;

import java.util.ArrayList;

/**
 *
 * @author Castro
 */
public class Costumer {

    private static int id = 0;
    private String name;
    private String phone;
    private String email;
    private String profession;
    private Account currentAccount;
    private ArrayList<Account> accountsList;
    private Card debitCard;
    private ArrayList<Card> cardsList;
}
