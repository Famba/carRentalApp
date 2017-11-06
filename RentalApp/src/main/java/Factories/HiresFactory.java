package Factories;

import Domain.Customer;
import Domain.Hires;

/**
 * Created by Riyaad on 11/6/2017.
 */
public class HiresFactory
{
    //Hires
    public static Hires getOrder(String hDate, Customer customer ) {

        Hires hired = new Hires.Builder()
                .customer(customer)
                .HiredDate(hDate)
                .build();
        return hired;
    }

}
