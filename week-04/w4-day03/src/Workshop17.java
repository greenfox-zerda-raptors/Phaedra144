/**
 * File I/O: The copy command exercise
 * <p>
 * This is just standard I/O and it's usually given as an early IT assignment.
 * <p>
 * Given all that you've already seen and done, this should be fairly easy.
 * <p>
 * This is how it should work, but NOTE ...
 * >>> means that what the computer does; and
 * <<< is what you the user does.
 * <p>
 * >>> Enter the Source filename (assuming reading from C:\TEMP\) or give a different path name to?
 * <<< TestA.txt
 * >>> File does not exist, try again or blank to exit
 * <<< Test.txt
 * >>> Enter the Target filename (assuming writing to C:\TEMP\) or give a different path name?
 * <<< NewTest.txt
 * >>> Writing from C:\TEMP\Test.txt to C:\TEMP\NewTest.txt.  Press Y to confirm, N to abort.
 * <<< Y
 * >>> Done, wrote 102 Characters to C:\TEMP\NewTest.txt.
 * <p>
 * Note that you should compute the working directory (e.g. C:\TEMP\).
 */

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Workshop17 {

    public static String basePath = "/F:/Szilvia/Greenfox/JavaBits/";

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the Source filename or give a different path name to?");
            File source = loadFile(input);
            if (source == null) {
                return; //End of program, because User said "blank" for file name
            }
            System.out.println("dear user, eneter a destination file name, assuming the same path: " + basePath);
            String fileNameDestination = input.next();
            System.out.println("We are copying from " + source.getPath() + " to " + basePath + fileNameDestination + " , confirm with Y or N to abort.");
            String confirm = input.next();
            if (confirm.equalsIgnoreCase("n")){
            }
            else if (confirm.equalsIgnoreCase("y")){
                File destination = new File(basePath + fileNameDestination);
                if (!destination.exists()){
                    destination.createNewFile();
                }
                BufferedReader reader = new BufferedReader(new FileReader(source));
                BufferedWriter writer = new BufferedWriter(new FileWriter(destination));
                String line = reader.readLine();
                int length = line.length();
                while (line != null) {
                    writer.write(line);
                    line = reader.readLine();

                    if (line != null) {
                        writer.newLine();
                        length += line.length() +1;
                    }
                }
                reader.close();
                writer.close();
                System.out.println("We are done. Wrote " + length + " characters.");
            }

        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        // get the directory
        // get the names & confirm the source is okay and if the target exists ignore error (if already exists)
        // confirm action
        // confirm
        // read/write and count
        // report


    }
    public static File loadFile(Scanner inputFileName) {
        String fileNameSource = inputFileName.next();
        if (fileNameSource.equals("")) {
            return null;
        }
        File source = new File(basePath + fileNameSource);
        if (source.exists()) {
            return source;
        } else {
            System.out.println("sorry, this file doesn!t exist, please try again, or blank to exit");
            return loadFile(inputFileName);
        }

    }
}
