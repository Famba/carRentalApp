package com.vehicleRental.controller;

import com.vehicleRental.domain.Customer;
import com.vehicleRental.factories.CustomerFactory;
import com.vehicleRental.services.Impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Noor on 28/10/2017.
 */
@Controller
@RequestMapping(path = "/customer")
public class CustomerController {


    @Autowired
    private CustomerServiceImpl customerService;

    //@Autowired
    //private InvoiceServiceImpl invoiceService;

    private Customer customer;

    //private Invoices invoices;


    @CrossOrigin
    //  http://localhost:8080/customer/addCustomer?name=noor&surname=mo&email=thab.moopa&city=23+Kiwi+Str+Mandalay+CaapeTown+7785
    //@GetMapping(path = "/{invoiceId}/addCustomer")
    @PostMapping(path = "/addCustomer")
    public
    @ResponseBody
    Customer addCustomer(@RequestParam String name, @RequestParam String surname, @RequestParam String email,
                         @RequestParam String address)
    {
        Map<String, String> stringValues = new HashMap<String, String>();
        stringValues.put("name", name);
        stringValues.put("surname", surname);
        stringValues.put("email", email);
        stringValues.put("address", address);
        customer = CustomerFactory.getCustomer(stringValues);

        return customerService.create(customer);
    }

    @CrossOrigin
    //http://localhost:8080/customer/findCustomerByID?customerID=1
    @GetMapping(path = "/findCustomerByID")
    public
    @ResponseBody
    Customer findCustomerByID(long customerID) {
        return  customer = customerService.read(customerID);
    }

    @CrossOrigin
    @GetMapping(path = "/updateCustomer")
    public
    @ResponseBody
    Customer updateCustomer(@RequestParam long customerId, @RequestParam String name, @RequestParam String surname, @RequestParam String email,
                            @RequestParam String address) {


        //customerService.read(customerId);
        Customer customerUpdate = new Customer.Builder()
                .id(customerId)
                .name(name)
                .surname(surname)
                .email(email)
                .address(address)
                .build();

        return customerService.update(customerUpdate);
    }

    @CrossOrigin
    @GetMapping(path = "/deleteCustomer")
    public
    @ResponseBody
    void deleteCustomer(@RequestParam long customerID) {
        customerService.delete(customerID);
    }

    @CrossOrigin
    @GetMapping(path = "/findAll")
    public @ResponseBody Iterable<Customer> getAllCustomers()
    {
        return customerService.findAll();
    }

    @CrossOrigin
    @GetMapping(path = "/findByEmail")
    public @ResponseBody Customer availableEmail(String email)
    {
        return customerService.availableEmail(email);
    }


}
