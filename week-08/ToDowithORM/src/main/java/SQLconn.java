import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;

/**
 * Created by ${SzilviaB} on 2016. 12. 15..
 */
public class SQLconn {

    String databaseUrl = "jdbc:mysql://127.0.0.1:3306/todo?user=root&password=12345";
    Dao<Task, Integer> taskDao;

    public SQLconn() throws SQLException {
        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);
        TableUtils.createTableIfNotExists(connectionSource, Task.class);
        taskDao = DaoManager.createDao(connectionSource, Task.class);
    }

    public void createTaskIfNotExists(Task tsk) throws SQLException {
        if(taskDao.queryForId(tsk.getId()) == null) {
            taskDao.create(tsk);
        }
        else {
            taskDao.update(tsk);
        }
    }

    public Dao<Task, Integer> getTaskDao() {
        return taskDao;
    }
}
