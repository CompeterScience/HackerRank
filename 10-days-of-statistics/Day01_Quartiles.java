import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int end = Integer.valueOf( scan.nextLine() );
        String[] str = scan.nextLine().split(" ");
        int[] vals = new int[end];
        for (int i = 0; i < end; i++) {
            vals[i] = Integer.valueOf(str[i]);
        }
        Arrays.sort(vals);
               
        int q1 = 0;
        int q2 = 0;
        int q3 = 0;
        int half = end / 2;
        int quarter = end / 4;
        if ( end % 2 == 0 ) {
            q2 = (vals[half-1] + vals[half]) / 2;
            if ( half % 2 == 0 ) {
                q1 = (vals[quarter-1] + vals[quarter]) / 2;
                q3 = (vals[half+quarter-1] + vals[half+quarter]) / 2;                
            } else {
                q1 = vals[quarter];
                q3 = vals[half+quarter];
            }
        } else {
            q2 = vals[half];
            if ( half % 2 == 0 ) {
                q1 = (vals[quarter-1] + vals[quarter]) / 2;
                q3 = (vals[half+quarter] + vals[half+quarter+1]) / 2;
            } else {
                q1 = vals[quarter];
                q3 = vals[half+quarter+1];
            }
        }
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
    }
}
