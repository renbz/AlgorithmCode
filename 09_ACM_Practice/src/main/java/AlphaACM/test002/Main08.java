package AlphaACM.test002;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main08 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        int count = 0;

        StringBuilder builder = new StringBuilder();
        for (int i = l; i <= r; i++) {
            builder.append(i);
        }

        String s = builder.toString();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '2') count++;
        }
        System.out.println(count);
    }
}

