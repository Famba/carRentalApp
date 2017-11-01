package Repository;

import Domain.Customer;


/**
 * Created by Riyaad on 11/1/2017.
 */
public interface CustomerRepository
{
    Customer create(Customer cust1);
    Customer read(String id);
    Customer update(Customer customerDetails);
    void delete(String id);
}
