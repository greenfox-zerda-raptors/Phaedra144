import java.io.*;

/**
 * Created by ${SzilviaB} on 2016. 11. 17..
 */
public class FileI_O {
    public String basePath = "/F:/Szilvia/Greenfox/Phaedra144/GUI/GUIToDo/";
    File sourceFile = new File(basePath + "toDoList.txt");
    BufferedReader reader;

    public FileI_O() throws FileNotFoundException {
        this.reader = new BufferedReader(new FileReader(sourceFile));
    }
    public File fileCreator() throws IOException {
        if (!sourceFile.exists()) {

            sourceFile.createNewFile();
        }
        return sourceFile;
    }

    public String readLine() throws IOException {
        return this.reader.readLine();
    }




}
