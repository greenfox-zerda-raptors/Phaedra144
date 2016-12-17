import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ${SzilviaB} on 2016. 11. 17..
 */
@DatabaseTable(tableName = "tasks")
public class Task {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField ()
    private String name;

    @DatabaseField ()
    private boolean status;

    @DatabaseField()
    private String timeStamp;

    public Task (){

    }

    public Task (String name){
        this.name = name;
        this.status = false;
        this.timeStamp = new SimpleDateFormat("yyyy.MM.dd.").format(new Date());
    }

    public int getId() {
        return id;
    }


    public void setStatus (boolean status){


        this.status = status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public String getName (){
        return this.name;
    }

    @Override
    public String toString() {
        if (this.status == true){
            return ("[X] " + this.name + " - " + this.timeStamp);
        }
        else {
            return ("[ ] " + this.name + " - " + this.timeStamp);
        }
    }


}
