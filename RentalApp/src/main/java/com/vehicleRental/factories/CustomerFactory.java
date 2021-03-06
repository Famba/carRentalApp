package com.vehicleRental.factories;

import com.vehicleRental.domain.Customer;

import java.util.Map;

/**
 * Created by Noor on 27/10/2017.
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
                //.invoices(invoices)
                .build();
        return customer;
    }

}
