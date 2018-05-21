import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int c0 = 0;
            int c1 = 0;
            for (int j = 0; j < n; j++) {
                c1 = b * (int) Math.pow(2, j);
                int s = a + c0 + c1;
                c0 += c1;
                System.out.print(s + " ");
            }
            System.out.print("\n");
        }
        in.close();
    }
}
