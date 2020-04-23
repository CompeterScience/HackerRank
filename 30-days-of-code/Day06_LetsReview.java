import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        scan.nextLine();
        for (int i=0; i<testCases; i++) {
            String inputString = scan.nextLine();
            char[] inputCharArray = inputString.toCharArray();
            String oddChars = "";
            String evenChars = "";
            for(int j=0; j<inputString.length(); j++){
                if (j % 2 == 0) {
                    oddChars += Character.toString(inputCharArray[j]);
                } else {
                    evenChars += Character.toString(inputCharArray[j]);
                }
            }
            System.out.println(oddChars + " " + evenChars);
        }       
        scan.close(); 
    }
}
