package java_2020_B;

/**
 * @author Ren
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Main008_字符串编码 {

    static Character[] c = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
            'M', 'N', 'O', 'P', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    //截取字符串并转化为整数 再转化为字母
    public static void change(StringBuilder str) {
        while (str.length() > 0) {
            if (str.length() >= 2) {
                int a = Integer.parseInt(str.substring(0, 2));
                if (a <= 26) {
                    System.out.print(c[a]);
                    StringBuilder s = new StringBuilder(str.substring(2, str.length()));
                    change(s);
                } else {
                    a = a / 10;
                    System.out.print(c[a]);
                    StringBuilder s = new StringBuilder(str.substring(1, str.length()));
                    change(s);
                }
            } else {
                int a = Integer.parseInt(str.substring(0, 1));
                System.out.print(c[a]);
                StringBuilder s = new StringBuilder(str.substring(1, str.length()));
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder str = new StringBuilder(in.nextLine());
        change(str);


    }
}