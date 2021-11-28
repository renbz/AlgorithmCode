package AlphaACM.match02;

/**
 * @author Ren
 */

import java.util.*;

public class Main_F {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Set set = new HashSet();
        for (int i = 0; i < n; i++) {
            int element = in.nextInt();
            if (set.add(element)) System.out.print(element + " ");
        }
    }

}
