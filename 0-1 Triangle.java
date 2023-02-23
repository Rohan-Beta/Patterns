// 0-1 triangle

import java.util.*;

class Firstclass {
    public static void main(String args[]) {

        for(int i = 1; i <= 5; i += 1) { // rows
            for(int j = 1; j <= i; j += 1) { // columns

                if((i+j)%2 == 0) {
                    System.out.print(1);
                }
                else {
                    System.out.print(0);
                }
            }
            System.out.print("\n");
        }
    }
}
