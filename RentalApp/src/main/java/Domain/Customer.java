package Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long custId;
    private String custName,custSurname,custEmail;
    private int custNo;
    private String custCity;
    private String custProvince;
    private int custpCode;
    private String flatNo;
    private String custStreet;


    private Customer()
    {
    }

    public long getcustId()
    {
        return custId;
    }

    public String getcustName() {
        return custName;
    }

    public String getcustSurname() {
        return custSurname;
    }

    public String getcustEmail() {
        return custEmail;
    }

    public int getcustNo() {
        return custNo;
    }

    public String getcustCity() {
        return custCity;
    }

    public String getcustProvince() {
        return custProvince;
    }

    public int getcustpCode() {
        return custpCode;
    }

    public String getflatNo() {
        return flatNo;
    }

    public String getcustStreet() {
        return custStreet;
    }

    public Customer(Builder builder)
    {
        this.custId = builder.custId;
        this.custName = builder.custName;
        this.custSurname = builder.custSurname;
        this.custEmail=builder.custEmail;
        this.custNo = builder.custNo;
        this.custCity = builder.custCity;
        this.custProvince = builder.custProvince;
        this.custpCode = builder.custpCode;
        this.flatNo = builder.flatNo;
        this.custStreet = builder.custStreet;
        //this.invoices = builder.invoices;
    }

    public static class Builder{
        private long custId;
        private String custName,custSurname,custEmail;
        private int custNo;
        private String custCity;
        private String custProvince;
        private int custpCode;
        private String flatNo;
        private String custStreet;

        public Builder custNo(int value)
        {
            this.custNo = value;
            return this;
        }
        public Builder custCity(String value)
        {
            this.custCity = value;
            return this;
        }
        public Builder custProvince(String value)
        {
            this.custProvince = value;
            return this;
        }
        public Builder custpCode(int value)
        {
            this.custpCode = value;
            return this;
        }
        public Builder flatNo(String value)
        {
            this.flatNo = value;
            return this;
        }
        public Builder custStreet(String value)
        {
            this.custStreet = value;
            return this;
        }
        public Builder custId(Long value)
        {
            this.custId = value;
            return this;
        }

        public Builder custName(String value)
        {
            this.custName = value;
            return this;
        }

        public Builder custSurname(String value)
        {
            this.custSurname = value;
            return this;
        }

        public Builder custEmail(String value)
        {
            this.custEmail=value;
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

            return custId == customer.custId;
        }

        @Override
        public int hashCode() {
            return (int) (custId ^ (custId >>> 32));
        }

    }





}
