// diamond pattern

import java.util.*;

class Firstclass {
    public static void main(String args[]) {

        for(int i = 1; i <= 4; i += 1) { // rows for first
            for(int j = 4-i; j >= 1; j -= 1) { // columns for space
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j += 1) { // columns
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }
        for(int i = 4; i >= 1; i -= 1) { // rows for second
            for(int j = 4-i; j >= 1; j -= 1) { // columns for space
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j += 1) { // columns
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }
    }
}
