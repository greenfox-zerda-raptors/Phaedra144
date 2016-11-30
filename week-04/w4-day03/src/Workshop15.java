import java.io.*;
import java.util.Scanner;

/**
 * Created by ${SzilviaB} on 2016. 11. 30..
 */
public class Workshop15 {
    public static void main(String[] args) {

        System.out.println("Enter the file path, or q to Quit");

        Scanner userInput = new Scanner(System.in);
        String filePath;

        System.out.print("File path: ");

        while (userInput.hasNextLine()) {
            filePath = userInput.nextLine();
            if (filePath.equals("q"))
                break;
            printFileContent(filePath);
            System.out.print("File path: ");
        }
    }

    private static void printFileContent(String filePath) {
        // Implement this function
        // Open and read the file and print it's content to the standard output
        // If a specified path does not exist write "The specified path does not exists!"
        File myFile = new File(filePath);

        try{

            BufferedReader getInfo = new BufferedReader(
                    new FileReader(myFile));

            // Reads a whole line from the file and saves it in a String

            String fileContent = getInfo.readLine();

            // readLine returns null when the end of the file is reached

            while (fileContent != null) {
                System.out.println(fileContent);

                fileContent = getInfo.readLine();

            }


        }

        // Can be thrown by FileReader

        catch (FileNotFoundException e) {

            System.out.println("Couldn't Find the File");
            System.exit(0);
        } catch (IOException e) {

            System.out.println("An I/O Error Occurred");
            System.exit(0);

        }
    }
}

