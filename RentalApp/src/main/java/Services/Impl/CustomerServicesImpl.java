package Services.Impl;

import Domain.Customer;
import Repository.CustomerRepository;
import Repository.Impl.CustomerRepositoryImpl;
import Services.CustomerServices;

/**
 * Created by Riyaad on 11/1/2017.
 */
//needs fixing
@Component
public class CustomerServicesImpl implements CustomerServices
{
    @Autowired
    CustomerRepository customerRepository;


    public Customer create(Customer customer) {
        return customerRepository.create(customer);
    }


    public Customer read(long id)
    {
        return customerRepository.read(id);
    }


    public Customer update(Customer customer)
    {
        return customerRepository.update(customer);
    }


    public void delete(long id)
    {
        customerRepository.delete(id);
    }


    public Customer availableEmail(String email)
    {
        return customerRepository.findByEmail(email);
    }

}
