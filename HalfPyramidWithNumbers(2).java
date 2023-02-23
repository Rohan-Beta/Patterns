// inverted half pyramid with numbers

import java.util.*;

class Firstclass {
    public static void main(String args[]) {

        for(int i = 1; i <= 4; i += 1) {
            for(int j = i; j >= 1; j -= 1) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
