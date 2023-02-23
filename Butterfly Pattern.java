// butterfly pattern

import java.util.*;

class Firstclass {
    public static void main(String args[]) {

        // upper half

        for(int i = 1; i <= 4; i += 1) { // i for rows
            for(int j = 1; j <= i; j += 1) { // j for columns
                System.out.print("*");
            }
            int space = 2 * (4-i);
            
            for(int j = space; j >= 1; j -= 1) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j += 1) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        // lower half

        for(int i = 4; i >= 1; i -= 1) { // i for rows
            for(int j = 1; j <= i; j += 1) { // j for columns
                System.out.print("*");
            }
            int sapce = 2* (4-i);

            for(int j = 1; j <= sapce; j += 1) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j += 1) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
