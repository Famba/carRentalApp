package Domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Riyaad on 11/6/2017.
 */
public class Admin
{
    //Admin
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long AdminID;
    private String adminName;
    private String adminSurname;
    private String password;
    private String role;

    private Admin(){}

    public long getAdminID() {
        return AdminID;
    }

    public String getadminName() {
        return adminName;
    }

    public String getadminSurname() {
        return adminSurname;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public Admin(Builder builder)
    {
        this.AdminID = builder.AdminID;
        this.adminName = builder.adminName;
        this.adminSurname = builder.adminSurname;
        this.password=builder.password;
        this.role=builder.role;
    }


    public static class Builder {
        private long AdminID;
        private String adminName, adminSurname, password, role;

        public Builder AdminID(long value) {
            this.AdminID = value;
            return this;
        }

        public Builder adminName(String value) {
            this.adminName = value;
            return this;
        }

        public Builder adminSurname(String value) {
            this.adminSurname = value;
            return this;
        }

        public Builder password(String value) {
            this.password = value;
            return this;
        }

        public Builder role(String value) {
            this.role = value;
            return this;
        }

        public Admin build() {
            return new Admin(this);
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Admin ad = (Admin) o;

            return AdminID == ad.AdminID;
        }

        @Override
        public int hashCode() {
            return (int) (AdminID ^ (AdminID >>> 32));
        }
    }


}
