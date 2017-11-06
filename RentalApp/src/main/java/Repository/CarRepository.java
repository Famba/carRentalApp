package Repository;

import Domain.Car;
import Domain.Category;

/**
 * Created by Riyaad on 11/1/2017.
 */
public interface CarRepository extends CrudRepository <Car, Long>
{
    Car create(Car car1);
    Car read(String id);
    Car update(Car carDetails);
    void delete(String id);


    Iterable<Car> readAll();
    Iterable<Car> findAllById(Category category);;

}

