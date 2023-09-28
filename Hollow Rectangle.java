// hollow rectangle

/* 

*****
*   *
*   *
*****

*/

import java.util.*;

class Firstclass {
    public static void main(String args[]) {

        for(int i = 1; i <= 4; i += 1) { //rows
            for(int j = 1; j <= 5; j += 1) { //columns

                if(i == 1 || j == 1 || i == 4 || j == 5) { //track index
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
