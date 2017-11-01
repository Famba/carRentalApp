package Repository;

import Domain.Car;

/**
 * Created by Riyaad on 11/1/2017.
 */
    public interface CarRepository
    {
        Car create(Car car1);
        Car read(String id);
        Car update(Car carDetails);
        void delete(String id);

    }

