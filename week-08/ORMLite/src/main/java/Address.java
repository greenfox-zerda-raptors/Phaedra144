import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by ${SzilviaB} on 2016. 12. 14..
 */
@DatabaseTable(tableName = "addresses")
public class Address {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField
    private String city;
    @DatabaseField
    private String country;
    @DatabaseField
    private String street;
    @DatabaseField
    private int postcode;

    public Address(String city, String country, String street, int postcode) {
        this.city = city;
        this.country = country;
        this.street = street;
        this.postcode = postcode;
    }

    public Address() {
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return  "postcode = " + postcode + "\n" +
                "city = " + city + "\n" +
                "country = " + country + "\n" +
                "street = " + street + "\n" +
                "}\n";
    }
}
