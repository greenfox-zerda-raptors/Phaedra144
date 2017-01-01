import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

public class Workshop03 {


    public static void main(String[] args) throws SQLException {
        Address firstAddress = new Address("Budapest", "Hungary", "Andrássy út", 1061);
        String databaseUrl = "jdbc:mysql://127.0.0.1:3306/workshop03?user=root&password=12345";

        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        TableUtils.createTableIfNotExists(connectionSource, Account2.class);
        TableUtils.createTableIfNotExists(connectionSource, Address.class);

        Dao<Account2, String> accountDao =
                DaoManager.createDao(connectionSource, Account2.class);

        Account2 account = new Account2("Captain America", "uejnsd632**234.", firstAddress);
        createAccountIfNotExists(accountDao, account);

        Account2 account2 = new Account2("Superman", "uejnsd632**234.", firstAddress);
        createAccountIfNotExists(accountDao, account2);



        account = accountDao.queryForId("Captain America");
        System.out.println(account.toString());
    }




    private static void createAccountIfNotExists(Dao<Account2, String> accountDao, Account2 acc) throws SQLException {
        if(accountDao.queryForId(acc.getName()) == null) {
            accountDao.create(acc);
        }
    }
}
