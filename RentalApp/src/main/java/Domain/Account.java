package Domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Riyaad on 11/6/2017.
 */
public class Account
{
    //Account
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long accNo;

    @ManyToOne
    private  Customer customer;

    private Account(){}
    public long getaccNo() {
        return accNo;
    }
    public Customer getCustomer() {
        return customer;
    }

    public Account(Builder builder)
    {
        this.accNo = builder.accNo;
        this.customer = builder.customer;
    }

    public static  class Builder
    {
        private long accNo;
        private  Customer customer;

        public Builder accNo(long value)
        {
            this.accNo = value;
            return this;
        }

        public Builder customer(Customer value)
        {
            this.customer = value;
            return this;
        }

        public Account build()
        {
            return new Account(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account acc = (Account) o;

        return accNo == acc.accNo;
    }

    @Override
    public int hashCode()
    {
        return (int) (accNo ^ (accNo >>> 32));
    }
}
