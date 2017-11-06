package Domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Riyaad on 11/6/2017.
 */
public class Hires
{
    //Hire
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String HiredDate;

    @ManyToOne
    private Customer customer;

    private Hires(){}

    public Hires(Builder builder) {
        this.id = builder.id;
        this.HiredDate = builder.HiredDate;
        this.customer = builder.customer;
    }

    public static class Builder{
        private long id;
        private Customer customer;
        private String HiredDate;

        public Builder customer(Customer value)
        {
            this.customer = value;
            return this;
        }

        public Builder id(long value)
        {
            this.id = value;
            return this;
        }
        public Builder HiredDate(String value)
        {
            this.HiredDate = value;
            return this;
        }


        public Hires build()
        {
            return new Hires(this);
        }
    }

    public long getId() {
        return id;
    }

    public String getHiredDate() {
        return HiredDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hires hires = (Hires) o;

        return id == hires.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

}
