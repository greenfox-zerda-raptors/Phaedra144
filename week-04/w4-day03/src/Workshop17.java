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

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Workshop17 {
    static Scanner inputFileName = new Scanner(System.in);
    public static void main(String[] args) {
        File myDir = new File("/F:/TEMP");
        System.out.println("Enter the Source filename or give a different path name to?");
        String fileName = inputFileName.next();




    }
    // get the directory
    // get the names & confirm the source is okay and if the target exists ignore error (if already exists)
    // confirm action
    // confirm
    // read/write and count
    // report



}


}
