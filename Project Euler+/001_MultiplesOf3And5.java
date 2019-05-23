import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static long countMultiples(int n) {
        long count3s  = n / 3;
        long count5s  = n / 5;
        long count15s = n / 15;
        
        long sum3s  =  3 * count3s  * (count3s  + 1) / 2;
        long sum5s  =  5 * count5s  * (count5s  + 1) / 2;
        long sum15s = 15 * count15s * (count15s + 1) / 2;
        
        return ( sum3s + sum5s - sum15s );
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println( countMultiples( n - 1 ) );
        }
    }
}
