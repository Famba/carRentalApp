package Factories;

import Domain.Customer;

import java.util.Map;

/**
 * Created by Riyaad on 11/1/2017.
 */
public class CustomerFactory
{

    //Customer Factory
    public static Customer getCustomer(Map<String, String> stringValues, Map<String,Integer> intValues)
    {
        Customer cust = new Customer.Builder()
                .custName(stringValues.get("name"))
                .custSurname(stringValues.get("surname"))
                .custEmail(stringValues.get("email"))
                .custCity(stringValues.get("city"))
                .custProvince(stringValues.get("province"))
                .flatNo(stringValues.get("Flat number"))
                .custStreet(stringValues.get("street"))
                .custNo(intValues.get("ID"))
                .custpCode(intValues.get("postal code"))
                //.invoices(invoices)
                .build();
        return cust;
    }
}
