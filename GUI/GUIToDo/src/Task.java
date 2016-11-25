/**
 * Created by ${SzilviaB} on 2016. 11. 17..
 */
public class Task {

    public String name;
    public boolean status;

    public Task (String name){
        this.name = name;
        this.status = false;
    }

    public String proba(){
        if (status){
            return "checked;" + this.name;
        }
        else {
            return "not_checked;" + this.name;
        }
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
            return ("[X] " + this.name);
        }
        else {
            return ("[ ] " + this.name);
        }
    }


}
