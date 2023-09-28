// solid rhombus

/*

   *****
  *   *
 *   *
*****

*/

import java.util.*;

class Firstclass {
    public static void main(String args[]) {

        for(int i = 1; i <= 4; i += 1) { // rows
            for(int j = 4-i; j >= 1; j -= 1) { // columns space
                System.out.print(" ");
            }
            for(int j = 1; j <= 5; j += 1) { // columns
                if(i == 1 || j == 1 || i == 4 || j == 5) { // conditions
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
