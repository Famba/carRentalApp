package Domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Riyaad on 11/6/2017.
 */
public class Rental
{
    //Rental
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String rentDate;
    private String returntDate;
    private BigDecimal totalPrice;
    private int daysRented;
    private boolean amountOutstanding;

    private Rental()
    {

    };

    @OneToOne
    @JoinColumn(name = "carID")
    private Car car;

    @ManyToOne
    private Hires Hired;

    public Long getId() {
        return id;
    }
    public String getRentDate() {
        return rentDate;
    }
    public String getReturntDate() {
        return returntDate;
    }
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }
    public Car getCar() {
        return car;
    }

    public int getdaysRented() {
        return daysRented;
    }

    public Hires getHired() {
        return Hired;
    }

    public boolean isamountOutstanding() {
        return amountOutstanding;
    }

    public Rental(Builder builder)
    {
        this.Hired = builder.Hired;
        this.id = builder.id;
        this.rentDate = builder.rentDate;
        this.returntDate = builder.returntDate;
        this.totalPrice = builder.totalPrice;
        this.daysRented = builder.daysRented;
        this.amountOutstanding = builder.amountOutstanding;

        this.car = builder.car;
    }

    public static  class Builder {
        private Long id;
        private String rentDate;
        private String returntDate;
        private BigDecimal totalPrice;
        private Car car;
        private Hires Hired;
        private int daysRented;
        private boolean amountOutstanding;

        public Builder amountOutstanding(boolean value)
        {
            this.amountOutstanding = value;
            return this;
        }
        public Builder daysRented(int value)
        {
            this.daysRented = value;
            return this;
        }
        public Builder Hired(Hires value)
        {
            this.Hired = value;
            return this;
        }
        public Builder id(Long value) {
            this.id = value;
            return this;
        }

        public Builder rentDate(String value) {
            this.rentDate = value;
            return this;
        }

        public Builder returntDate(String value) {
            this.returntDate = value;
            return this;
        }

        public Builder totalPrice(BigDecimal value) {
            this.totalPrice = value;
            return this;
        }


        public Builder car(Car value) {
            this.car = value;
            return this;
        }

        public Rental build() {
            return new Rental(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rental rent = (Rental) o;

        return id.equals(rent.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

}
