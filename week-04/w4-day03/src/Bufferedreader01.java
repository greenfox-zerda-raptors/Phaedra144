

import java.io.*;

public class Bufferedreader01 {
    public static void main(String[] args) throws Exception {

        String thisLine = null;
        try {
            // open input stream test.txt for reading purpose.
            BufferedReader br = new BufferedReader(new FileReader("/F:/Szilvia/Greenfox/JavaBits/input.txt"));
            while ((thisLine = br.readLine()) != null) {
                System.out.println(thisLine);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

