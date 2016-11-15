import java.io.*;

public class Workshop18 {
    public static void main(String[] args)  {
        BufferedReader br = null;
        BufferedReader br2 = null;
        try {

            br = new BufferedReader(new FileReader("/F:/Szilvia/Greenfox/JavaBits/18A.txt"));
            br2 = new BufferedReader(new FileReader("/F:/Szilvia/Greenfox/JavaBits/18B.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            String line1 = br.readLine();
            String line2 = br2.readLine();
            while (line1 != null || line2 != null) {
                if (line1 == null) {
                    System.out.println(line2);
                    line2 = br2.readLine();
                }
                else if(line2 == null){
                    System.out.println(line1);
                    line1 = br.readLine();
                }
                else {
                    int a = Integer.parseInt(line1);
                    int b = Integer.parseInt(line2);

                    if (a < b) {
                        System.out.println(a);
                        line1 = br.readLine();
                    } else {
                        System.out.println(b);
                        line2 = br2.readLine();
                    }

                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                br2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private static void printFileContent (String filePath) {
        // Implement this function
        // Open and read the file and print it's content to the standard output
        // If a specified path does not exist write "The specified path does not exists!"
    }
}