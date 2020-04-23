import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        // find dimension
        Scanner scan = new Scanner(System.in); 
        int dim = scan.nextInt();
        scan.nextLine();
        
        // initialize other variables
        int[] pxy = new int[2];
        int m = (dim - 1) / 2;
        int px, py, dx,dy;
        px = py = dx = dy = 0;

        // find position of (p)rincess
        for (int i = 0; i < dim; i++) {
            String str = scan.nextLine(); 
            for (int j = 0; j < dim; j++) {
                char cell = str.charAt(j);
                if (cell == 'p') {
                    px = j;
                    py = i;
                }
            }
        }
        
        // movement instructions
        dx = m - px;
        dy = m - py;
        if (dx < 0 && dy < 0) {
            for (int i = 0; i < Math.abs(dx); i++) {
                System.out.println("DOWN");
                System.out.println("RIGHT");
            }
        }
        if (dx < 0 && dy > 0) {
            for (int i = 0; i < Math.abs(dx); i++) {
                System.out.println("UP");
                System.out.println("RIGHT");
            }
        }
        if (dx > 0 && dy < 0) {
            for (int i = 0; i < Math.abs(dx); i++) {
                System.out.println("DOWN");
                System.out.println("LEFT");
            }
        }
        if (dx > 0 && dy > 0) {
            for (int i = 0; i < Math.abs(dx); i++) {
                System.out.println("UP");
                System.out.println("LEFT");
            }
        }
    }
}
