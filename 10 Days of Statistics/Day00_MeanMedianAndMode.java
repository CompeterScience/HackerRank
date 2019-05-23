import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int end = Integer.valueOf( scan.nextLine() );
        String[] str = scan.nextLine().split(" ");
        int[] vals = new int[end];

        // calculate mean
        int sum = 0;
        for (int i = 0; i < end; i++) {
            vals[i] = Integer.valueOf(str[i]);
            sum += vals[i];
        }
        float mean = ((float) sum) / end;
        
        // calculate median
        Arrays.sort(vals);
        float median = 0;
        if ( end % 2 == 0 ) {
            int mid2 = end / 2;
            int mid1 = mid2 - 1;
            median = (float) (vals[mid1] + vals[mid2]) / 2;
        } else {
            int mid = (end - 1) / 1;
            median = vals[mid];
        }
        
        // calculate mode     
        int[] mode = new int[4];
        for (int i = 0; i < end; i++) {
            if (vals[i] == mode[2]) {
                mode[3]++;
            } else {
                if (mode[3] > mode[1]) {
                    mode[0] = mode[2];
                    mode[1] = mode[3];
                }
                mode[2] = vals[i];
                mode[3] = 1;
            }
        }
        
        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode[0]);
    }
}
