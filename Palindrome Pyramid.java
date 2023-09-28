// pallindrome pattern

/*

   1
  212
 32123
4321234

*/

import java.util.*;

class Firstclass {
    public static void main(String args[]) {

        for(int i = 1; i <= 4; i += 1) { // rows

            for(int j = 4-i; j >= 1; j -= 1) { //columns space
                System.out.print(" ");
            }
            // first side

            for(int j = i; j >= 1; j -= 1) { // columns for first side
                System.out.print(j);
            }
            // second side

            for(int j = 2; j <= i; j += 1) { // columns for second side
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
