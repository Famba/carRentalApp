package Services;

import Domain.Customer;

/**
 * Created by Riyaad on 11/1/2017.
 */
public interface CustomerServices
{
    Customer create(Customer cust1);
    Customer read(String id);
    Customer update(Customer carDetails);
    void delete(String id);
}
