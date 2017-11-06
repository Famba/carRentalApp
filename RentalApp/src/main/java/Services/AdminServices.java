package Services;

import Domain.Admin;

/**
 * Created by Riyaad on 11/6/2017.
 */
public interface AdminServices
{
    Admin create(Admin ad);
    Admin read(long Adid);
    Admin update(Admin ad);
    void delete(long id);
    Iterable<Admin> findAllAdmins();//find all
}
