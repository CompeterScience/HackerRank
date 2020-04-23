import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String hh = s.substring(0,2);
        if ( hh.equals( "12" ) ){
            hh = "00";
        }
        if ( s.substring(8,10).equals( "PM" ) ) {
            hh = String.valueOf( Integer.valueOf(hh) + 12 );
        }
        return hh + s.substring(2,8);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
