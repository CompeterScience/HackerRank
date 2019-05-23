import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) { 
        int numInt = arr.length;
        float numNeg = 0;
        float numPos = 0;
        float numZero = 0;     
        
        for (int i = 0; i < numInt; i++) {
            if (arr[i] > 0) {
                numNeg++;
            }
            if (arr[i] < 0) {
                numPos++;
            }
            if (arr[i] == 0) {
                numZero++;
            }
        }      
        
        System.out.printf("%.6f%n", numNeg / numInt);
        System.out.printf("%.6f%n", numPos / numInt);
        System.out.printf("%.6f%n", numZero / numInt);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
