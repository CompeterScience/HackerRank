import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int length = Integer.valueOf( scan.nextLine() );
    
        //create array of values and calculate their mean
        int[] vals = new int[length];
        double sum = 0;
        double mean = 0;
        for(int i=0; i<length; i++) {
            int val = scan.nextInt();
            vals[i] = val;
            sum += val;
        }
        mean = sum / length;
        
        //calculate standard deviation
        double[] devs = new double[length];
        double ss = 0.0;
        float sd = 0;
        for(int i=0; i<length; i++) {
            double dev = Math.pow( (mean - vals[i]), 2);
            devs[i] = dev;
            ss += dev;
        }
        sd = (float) Math.sqrt( ss / length );
        
        System.out.printf("%.1f", sd);
    }
    
}
