// floyd's triangle

import java.util.*;

class Firstclass {
    public static void main(String args[]) {
        int num = 1;

        for(int i = 1; i <= 4; i += 1) { // rows
            for(int j = 1; j <= i; j += 1) { // columns
                System.out.print(num);

                num += 1;
            }
            System.out.print("\n");
        }
    }
}
