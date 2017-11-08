package Factories;

import Domain.Customer;

import java.util.Map;

/**
 * Created by Riyaad on 11/1/2017.
 */
public class CustomerFactory
{
    public static Customer getCustomer(Map<String, String> stringValues)
    {
        Customer customer = new Customer.Builder()
                .name(stringValues.get("name"))
                .surname(stringValues.get("surname"))
                .email(stringValues.get("email"))
                .address(stringValues.get("address"))
                .build();
        return customer;
    }

}
