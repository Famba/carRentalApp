package Services.Impl;

import Domain.Car;
import Repository.CarRepository;
import Repository.Impl.CarRepositoryImpl;
import Services.CarServices;

/**
 * Created by Riyaad on 11/1/2017.
 */
public class CarServicesImpl implements CarServices
{
    private static CarServicesImpl service = null;

    CarRepository repository = CarRepositoryImpl.getInstance();

    public static CarServicesImpl getInstance(){
        if(service == null)
            service = new CarServicesImpl();
        return service;
    }

    public Car create(Car createCar) {
        return repository.create(createCar);
    }

    public Car read(String id)
    {
        return repository.read(id);
    }

    public Car update(Car updateCar) {
        return repository.update(updateCar);
    }

    public void delete(String id)
    {
        repository.delete(id);

    }

}
