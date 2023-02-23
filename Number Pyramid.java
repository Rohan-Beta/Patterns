// number pyramid

import java.util.*;

class Firstclass {
    public static void main(String args[]) {

        for(int i = 1; i <= 4; i += 1) { // rows
            for(int j = 4-i; j >= 1; j -= 1) { //columns space
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j += 1) { // columns for number
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }
}
