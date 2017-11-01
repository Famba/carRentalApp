package Services.Impl;

import Domain.Customer;
import Repository.CustomerRepository;
import Repository.Impl.CustomerRepositoryImpl;
import Services.CustomerServices;

/**
 * Created by Riyaad on 11/1/2017.
 */
public class CustomerServicesImpl implements CustomerServices
{
    private static CustomerServicesImpl service = null;

    CustomerRepository repository = CustomerRepositoryImpl.getInstance();

    public static CustomerServicesImpl getInstance(){
        if(service == null)
            service = new CustomerServicesImpl();
        return service;
    }

    public Customer create(Customer createCustomer) {
        return repository.create(createCustomer);
    }

    public Customer read(String id)
    {
        return repository.read(id);
    }

    public Customer update(Customer updateCustomer) {
        return repository.update(updateCustomer);
    }

    public void delete(String id)
    {
        repository.delete(id);

    }

}
