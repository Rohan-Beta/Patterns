// half pyramid with numbers

import java.util.*;

class Firstclass {
    public static void main(String args[]) {

        for(int i = 1; i <= 4; i += 1) { // rows
            for(int j = 1; j <= i; j += 1) { // columns
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
