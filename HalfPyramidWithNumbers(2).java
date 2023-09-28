// inverted half pyramid with numbers

/*

1 
2 1 
3 2 1 
4 3 2 1 

*/

import java.util.*;

class Firstclass {
    public static void main(String args[]) {

        for(int i = 1; i <= 4; i += 1) { //rows
            for(int j = i; j >= 1; j -= 1) { //columns
                System.out.print(j+ " ");
            }
            System.out.print("\n");
        }
    }
}
