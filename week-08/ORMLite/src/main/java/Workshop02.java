import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Workshop02 {
    public static void main(String[] args) throws SQLException {
        String databaseUrl = "jdbc:mysql://127.0.0.1:3306/workshop02?user=root&password=12345";

        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        TableUtils.createTableIfNotExists(connectionSource, Account.class);

        Dao<Account, String> accountDao = DaoManager.createDao(connectionSource, Account.class);

        String[] names = {"Captain America","Iron Man", "Wolverine", "Hulk", "Loki"};
        String[] passwords = {"uejnsd632**234.","fgdfdfgrw","rhrth7888","5y5tytry7","3rfadvcv"};
        int x = 0;
        ArrayList<Account> accounts = new ArrayList<Account>();
        for (String name : names){
            Account tempAccount = new Account(name, passwords[x]);
            createAccountIfNotExists(accountDao, tempAccount);
            accounts.add(tempAccount);
            x++;
        }
        List<Account>accounts2 = accountDao.queryForAll();
        for (Account account : accounts2){

            System.out.println(account.toString());
        }

        QueryBuilder<Account, String> queryBuilder =
                accountDao.queryBuilder();
        queryBuilder.orderBy(Account.NAME_FIELD_NAME, true);

        PreparedQuery<Account> preparedQuery = queryBuilder.prepare();
        List<Account>accounts3 = accountDao.query(preparedQuery);
        for (Account account : accounts3){

            System.out.println(account.toString());
        }


    }

    private static void createAccountIfNotExists(Dao<Account, String> accountDao, Account acc) throws SQLException {
        if(accountDao.queryForId(acc.getName()) == null) {
            accountDao.create(acc);
        }
    }
}
