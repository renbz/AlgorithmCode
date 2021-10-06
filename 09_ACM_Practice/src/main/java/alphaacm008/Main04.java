package alphaacm008;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long res = 0;
        String s = sc.next();
        for (char c : s.toCharArray()) {
            res += c - '0';
        }
        System.out.println(res);
    }
}
