package Factories;

import Domain.Car;
import Domain.Category;

import java.util.Map;

/**
 * Created by Riyaad on 11/1/2017.
 */
public class CarFactory
{
    //CarFactory
    public static Car getCar(Category category, Map<String, String> stringValues, int year, boolean status)
    {
        Car car = new Car.Builder()
                .make(stringValues.get("make"))
                .model(stringValues.get("model"))
                .numberPlate(stringValues.get("numberPlate"))
                .status(status)
                .year(year)
                .category(category)
                .build();
        return car;
    }



}
