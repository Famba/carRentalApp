package Services;

import Domain.Account;

/**
 * Created by Riyaad on 11/6/2017.
 */
public interface AccountServices
{
    Account create(Account acc);
    Account read(long id);
    Account update(Account acc);
    void delete(long accNo);
    Iterable<Account> findAll();//findall
}
