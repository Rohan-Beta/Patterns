// 0-1 triangle

/*
    1 
   0 1 
  1 0 1 
 0 1 0 1 
1 0 1 0 1

*/

import java.util.*;

class Firstclass {
    public static void main(String args[]) {

        for(int i = 1; i <= 5; i += 1) {
            for(int j = 5-i; j >= 1; j -= 1) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j += 1) {

                if((i+j) % 2 == 0) {
                    System.out.print(1 + " ");
                }
                else {
                    System.out.print(0 + " ");
                }
            }
            System.out.print("\n");
        }
    }
}
