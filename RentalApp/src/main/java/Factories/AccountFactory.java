package Factories;

import Domain.Account;
import Domain.Customer;

/**
 * Created by Riyaad on 11/6/2017.
 */
public class AccountFactory
{
    //AccountFactory
    public  static Account getAccount(Customer cust)
    {
        Account acc = new Account.Builder()
                .customer(cust)
                .build();
        return acc;
    }

}
