import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by ${SzilviaB} on 2016. 12. 27..
 */
@DatabaseTable(tableName = "accounts")
public class Account2 {
    public static final String NAME_FIELD_NAME = "name";
    public static final String PASSWORD_FIELD_NAME = "password";


    @DatabaseField(id = true, columnName = NAME_FIELD_NAME)
    private String name;

    @DatabaseField (columnName = PASSWORD_FIELD_NAME)
    private String password;

    @DatabaseField(foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    private Address address;


    public Account2() {
// ORMLite needs a no-arg constructor
    }

    public Account2 (String name, String password, Address address){
        this.name = name;
        this.password = password;
        this.address = address;
    }

    public Account2(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "{\n" +
                "name = " + name + "\n" +
                "address = " + "{" + "\n" + address +
                "}";
    }
}
