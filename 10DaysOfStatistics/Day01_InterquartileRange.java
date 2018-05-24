import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        //scan input and handle small cases
        Scanner scan = new Scanner(System.in);
        int sizeX = scan.nextInt();
        if( sizeX < 2 ) {
            double err = (double) scan.nextInt();
            System.out.println(err);
            return;
        }

        //populate X array
        int[] arrX = new int[sizeX];
        for( int i = 0; i < sizeX; i++ ) {
            arrX[i] = scan.nextInt();
        }
        
        //populate F array and find total frequency
        int[] arrF = new int[sizeX];
        int totalFreq = 0;
        for( int i = 0; i < sizeX; i++ ) {
            arrF[i] = scan.nextInt();
            totalFreq += arrF[i];
        }
        
        //create S array and sort it
        int[] arrS = new int[totalFreq];
        int start = 0;
        for( int i = 0; i < sizeX; i++ ) {
            for( int j = start; j < start + arrF[i]; j++ ) {
                arrS[j] = arrX[i];
            }
            start += arrF[i];
        }
        Arrays.sort(arrS);
        
        //find Q2
        int rightQ2 = totalFreq / 2;
        int leftQ2 = rightQ2 + totalFreq % 2 - 1;       
        double q2 = (double) (arrS[leftQ2] + arrS[rightQ2]) / 2;
        
        //find Q1
        int rightQ1 = rightQ2 / 2;
        int leftQ1 = rightQ1 + rightQ2 % 2 - 1; 
        double q1 = (double) (arrS[leftQ1] + arrS[rightQ1]) / 2;
        
        //find Q3
        int rightQ3 = rightQ2 + rightQ1 + totalFreq % 2;
        int leftQ3  = rightQ2 + leftQ1  + totalFreq % 2; 
        double q3 = (double) (arrS[leftQ3] + arrS[rightQ3]) / 2;
        
        //find IQR
        double iqr = q3 - q1;
        System.out.println(iqr);       
    }
    
}
