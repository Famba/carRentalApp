package com.vehicleRental.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Riyaad on 27/10/2017.
 */
@Entity
public class Customer implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name,surname,email, address;


    private Customer(){
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }


    public Customer(Builder builder)
    {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.email=builder.email;
        this.address = builder.address;
        //this.invoices = builder.invoices;
    }

    public static class Builder{
        private long id;
        private String name,surname,email, address;
       // private List<Invoices> invoices;

//        public Builder invoices (List<Invoices> value)
//        {
//            this.invoices = value;
//            return this;
//        }

        public Builder address(String value)
        {
            this.address = value;
            return this;
        }
        public Builder id(Long value)
        {
            this.id = value;
            return this;
        }

        public Builder name(String value)
        {
            this.name = value;
            return this;
        }

        public Builder surname(String value)
        {
            this.surname = value;
            return this;
        }

        public Builder email(String value)
        {
            this.email=value;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Customer customer = (Customer) o;

            return id == customer.id;
        }

        @Override
        public int hashCode() {
            return (int) (id ^ (id >>> 32));
        }

    }





}
