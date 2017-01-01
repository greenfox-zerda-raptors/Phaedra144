import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by ${SzilviaB} on 2016. 12. 14..
 */

@DatabaseTable(tableName = "accounts")
public class Account {
    public static final String NAME_FIELD_NAME = "name";
    public static final String PASSWORD_FIELD_NAME = "password";


    @DatabaseField(id = true, columnName = NAME_FIELD_NAME)
    private String name;

    @DatabaseField (columnName = PASSWORD_FIELD_NAME)
    private String password;


    public Account() {
// ORMLite needs a no-arg constructor
    }

    public Account(String name, String password) {
        this.name = name;
        this.password = password;
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
        return name;
    }
}
