package 好未来.秋招2021_01;

/**
 * @author Ren
 */

import java.util.*;

public class Main03 {

    static int x = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        int k = in.nextInt();

        String[] s = str.split(",");

        int len = s.length;

        if (k % len == 0) {
            for (int i1 = 0; i1 < s.length - 1; i1++) {
                System.out.print(s[i1]);
                System.out.print(",");
            }
            System.out.println(s[s.length - 1]);
            return;
        }


        boolean[] res = new boolean[len];
        String t1 = s[0];
        String t2 = "";
        int i = 0;
        while (!f(res)) {
            while (res[i] == false) {
                //t1 = s[i];
                t2 = s[(i + k) % len];

                s[(i + k) % len] = t1;
                t1 = t2;
                res[i] = true;
                i = (i + k) % len;
            }
        }


        for (int i1 = 0; i1 < s.length - 1; i1++) {
            System.out.print(s[i1]);
            System.out.print(",");
        }
        System.out.println(s[s.length - 1]);

    }

    // 判断是否全部选择完毕
    private static boolean f(boolean[] b) {

        for (int i = 0; i < b.length; i++) {

            if (b[i] == false) {
                x = i;
                return false;
            }
        }
        return true;
    }
}
