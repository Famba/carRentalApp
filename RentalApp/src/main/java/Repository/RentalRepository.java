package Repository;

import Domain.Rental;

/**
 * Created by Riyaad on 11/6/2017.
 */
public interface RentalRepository extends CrudRepository<Rental, Long>
{

    Iterable<Rental> findAllById(long id);//finds all Rentals

}
