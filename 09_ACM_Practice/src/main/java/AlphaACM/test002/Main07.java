package AlphaACM.test002;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main07 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int count = 0;
        for (int i = a; i <= b; i++) {
            boolean bool = isFiveBS(i);
            if (bool) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isFiveBS(int num) {
        String s = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (int) s.charAt(i) - 48;
        }
        return sum % 5 == 0;
    }
}

