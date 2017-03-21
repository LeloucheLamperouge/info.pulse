package lesson6.testDAO;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Lelouch on 11.03.2017.
 */
@DatabaseTable (tableName = "customers")
public class Customer {
    @DatabaseField(id = true)
    int customerNumber;
    @DatabaseField(canBeNull = false)
    String customerName;
    @DatabaseField(canBeNull = false)
    String contactLastName;
    @DatabaseField(canBeNull = false)
    String contactFirstName;
    @DatabaseField(canBeNull = false)
    String phone;
    @DatabaseField(canBeNull = false)
    String addressLine1;
    @DatabaseField()
    String addressLine2;
    @DatabaseField(canBeNull = false)
    String city;
    @DatabaseField()
    String state;
    @DatabaseField()
    String postalCode;
    @DatabaseField(canBeNull = false)
    String country;
    @DatabaseField()
    int salesRepEmployeeNumber;
    @DatabaseField()
    double creditLimit;
    public Customer(){

    }

    public Customer(int customerNumber, String customerName, String contactLastName,
                    String contactFirstName, String phone, String addressLine1,
                    String addressLine2, String city, String state,
                    String postalCode, String country, int salesRepEmployeeNumber, double creditLimit) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.contactLastName = contactLastName;
        this.contactFirstName = contactFirstName;
        this.phone = phone;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.salesRepEmployeeNumber = salesRepEmployeeNumber;
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", customerName='" + customerName + '\'' +
                ", contactLastName='" + contactLastName + '\'' +
                ", contactFirstName='" + contactFirstName + '\'' +
                ", phone='" + phone + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                ", salesRepEmployeeNumber=" + salesRepEmployeeNumber +
                ", creditLimit=" + creditLimit +
                '}';
    }
}
