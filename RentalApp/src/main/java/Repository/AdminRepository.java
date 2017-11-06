package Repository;

import Domain.Admin;

/**
 * Created by Riyaad on 11/6/2017.
 */
public interface AdminRepository extends CrudRepository <Admin, Long>
{
    Admin create(Admin ad);
    Admin read(String id);
    Admin update(Admin ad);
    void delete(String id);

}
