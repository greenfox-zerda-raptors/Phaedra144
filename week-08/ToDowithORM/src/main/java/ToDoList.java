import com.j256.ormlite.stmt.DeleteBuilder;
import com.j256.ormlite.stmt.PreparedDelete;
import java.sql.SQLException;

import java.util.List;

/**
 * Created by ${SzilviaB} on 2016. 11. 17..
 */
public class ToDoList {

    public List<Task> myList;
    SQLconn sqlConn = new SQLconn();

    public ToDoList() throws SQLException {

        loadTable();
    }

    public void loadTable() {
        try {

            myList = sqlConn.getTaskDao().queryForAll();

        } catch (SQLException | NullPointerException e) {
            e.printStackTrace();
        }
    }


    public void add(String taskName) {
        Task g = new Task(taskName);
        myList.add(g);

    }


    public String getList() {
        String x = "";
        for (int i = 0; i < myList.size(); i++) {
            Task item = myList.get(i);
            x += String.format("%d - %s \n", (i + 1), item.toString());
        }
        if (x.length() == 0) {
            x = "Your ToDo list is empty";
        }

        return x;
    }

    public void remove(int i) throws SQLException {
        DeleteBuilder<Task,Integer> deleteBuilder = sqlConn.getTaskDao().deleteBuilder();
        deleteBuilder.where().eq("id", myList.get(i-1).getId());
        PreparedDelete<Task>preparedDeleteQuery=deleteBuilder.prepare();
        sqlConn.getTaskDao().delete(preparedDeleteQuery);
        myList.remove(i - 1);

    }

    public void removeAll() throws SQLException {
        DeleteBuilder<Task, Integer> deleteBuilder = sqlConn.getTaskDao().deleteBuilder();
        Task item = null;
        for (int i = 0; i < myList.size(); i++) {
            item = myList.get(i);
        }
        deleteBuilder.where().eq("id", item.getId() != 0);
        PreparedDelete<Task> preparedDeleteQuery = deleteBuilder.prepare();
        sqlConn.getTaskDao().delete(preparedDeleteQuery);
        myList.clear();
    }

    public void complete(int i) {
        Task item = myList.get(i - 1);
        item.setStatus(true);
    }

    public void writeListToSQL() throws SQLException {
        sqlConn = new SQLconn();
        for (Task myListItem : myList) {
            sqlConn.createTaskIfNotExists(myListItem);
        }
    }

}
