package Services.Impl;

import Domain.Account;
import Repository.AccountRepository;
import Services.AccountServices;

/**
 * Created by Riyaad on 11/6/2017.
 */
//needs fixing
@Component
public class AccountServicesImpl implements AccountServices
{
    @Autowired
    private AccountRepository AccountRepository;

    public Account create(Account acc)
    {
        return  AccountRepository.create(acc);
    }
    public Account read(long id)
    {
        return AccountRepository.read(id);
    }
    public Account update(Account acc)
    {
        return AccountRepository.update(acc);
    }
    public void delete(long id)
    {
        AccountRepository.delete(id);
    }
    public Iterable<Account> findAll()
    {
        return  AccountRepository.readAll();
    }

}
