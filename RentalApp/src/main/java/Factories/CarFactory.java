package Factories;

import Domain.Car;

import java.util.Map;

/**
 * Created by Riyaad on 11/1/2017.
 */
public class CarFactory
{
    public static Car getCarDetails(Map<String, String> values, String carReg,Boolean avail)
    {
        Car car1 = new Car.Builder()
                .carName(values.get("carName"))
                .carModel(values.get("carModel"))
                .carRegNo(carReg)
                .carYear(values.get("carYear")).carAvailability(avail).build();
        return car1;
    }



}
