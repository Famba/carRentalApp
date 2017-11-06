package Repository;

import Domain.Account;

/**
 * Created by Riyaad on 11/6/2017.
 */
public interface AccountRepository extends CrudRepository <Account, Long>
{
   Account create(Account acc);
    Account read(long id);
    Account update(Account acc);
    void delete(long id);
    Iterable<Account> readAll();
}
