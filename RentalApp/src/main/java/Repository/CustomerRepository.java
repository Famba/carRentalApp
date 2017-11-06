package Repository;

import Domain.Customer;

/**
 * Created by Riyaad on 11/1/2017.
 */public interface CustomerRepository extends CrudRepository<Customer,Long>
{
    Customer create(Customer cust);
    Customer read(long id);
    Customer update(Customer cust);
    void delete(long id);
    Customer findByEmail(String email);
    }

