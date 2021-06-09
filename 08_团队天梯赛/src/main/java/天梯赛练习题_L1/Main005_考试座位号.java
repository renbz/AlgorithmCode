package 天梯赛练习题_L1;

/**
 * @author Ren
 */

import java.util.*;

public class Main005_考试座位号 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        HashMap<String, String> map = new HashMap<>(k);
        while (k-- > 0) {
            String str1 = in.next();
            String n1 = in.next();
            String n2 = in.next();
            map.put(n1, str1 + " " + n2);
        }
        int k2 = in.nextInt();
        while (k2-- > 0) {
            System.out.println(map.get(in.next()));
        }
    }
}