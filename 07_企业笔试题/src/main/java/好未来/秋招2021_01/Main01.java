package 好未来.秋招2021_01;

/**
 * @author Ren
 */

import org.omg.CORBA.ARG_OUT;

import java.util.*;

public class Main01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();

        s1 = s1.replace(".", "#");
        s2 = s2.replace(".", "#");
        String[] res1 = s1.split("#");
        String[] res2 = s2.split("#");
        int len1 = res1.length;
        int len2 = res2.length;
        int index1 = 0, index2 = 0;
        while (index1 < len1 && index2 < len2) {
            int num1 = Integer.parseInt(res1[index1]);
            int num2 = Integer.parseInt(res2[index2]);
            if (num1 == num2) {
                index1++;
                index2++;
            }
            if (num1 > num2) {
                System.out.println(1);
                return;
            }
            if (num1 < num2) {
                System.out.println(-1);
                return;
            }
        }
        int count2 = len2 - index2;
        int count1 = len1 - index1;



        if (index1 == len1 && index2 == len2) {
            System.out.println(0);
            return;
        }
        if (index1 == len1 && index2 < len2) {
            while (index2 < len2) {
                if (Integer.parseInt(res2[index2]) != 0) {
                    System.out.println(-1);
                    return;
                }
                index2++;
            }
            System.out.println(0);
        }
        if (index1 < len1 && index2 == len2) {
            while (index1 < len1) {
                if (Integer.parseInt(res1[index1]) != 0) {
                    System.out.println(1);
                    return;
                }
                index1++;
            }
            System.out.println(0);
        }

    }

}
