package Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Riyaad on 11/6/2017.
 */
@Entity
public class Category implements Serializable {
    //Category
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long catID;
    private String catName;
    private double catPrice;

    private Category()
    {

    }

    public static class Builder
    {
        private long catID;
        private String catName;
        private double catPrice;

        public Builder catID(long value)
        {
            this.catID = value;
            return this;
        }
        public Builder catName(String value)
        {
            this.catName = value;
            return this;
        }
        public Builder catPrice(double value)
        {
            this.catPrice = value;
            return this;
        }
        public Category build()
        {
            return new Category(this);
        }
    }

    public Category(Builder builder) {
        this.catID = builder.catID;
        this.catName = builder.catName;
        this.catPrice = builder.catPrice;
    }


    public long getcatID() {
        return catID;
    }

    public String getcatName() {
        return catName;
    }

    public double getcatPrice() {
        return catPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        return catID == category.catID;
    }

    @Override
    public int hashCode() {
        return (int) (catID ^ (catID >>> 32));
    }
}

