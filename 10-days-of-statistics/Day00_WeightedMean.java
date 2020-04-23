import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int end = Integer.valueOf( scan.nextLine() );
        
        // extract values
        String[] str = scan.nextLine().split(" ");
        int[] values = new int[end];
        for (int i = 0; i < end; i++) {
            values[i] = Integer.valueOf(str[i]);
        }
        
        // extract weights
        str = scan.nextLine().split(" ");
        int sum = 0;
        int weight = 0;
        for (int i = 0; i < end; i++) {
            sum += values[i] * Integer.valueOf(str[i]);
            weight += Integer.valueOf(str[i]);
        }
        
        // calculate weighted average
        float wavg = (float) sum / weight;
        System.out.printf("%.1f", wavg);    
    }
}
