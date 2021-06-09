package AlphaACM.test002;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int c1 = 0, c2 = 0, c3 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))
                c1++;
                // Character.isLetter()  是java自带的判断是否为字母的方法，但有些情况下非字母也会返回true
                // 所以用一下方式 判断是否为大写字母或小写字母
            else if (Character.isLowerCase(s.charAt(i)) || Character.isUpperCase(s.charAt(i)))
                c2++;
        }
        System.out.println("Letters="+c2);
        System.out.println("Digits="+c1);
        System.out.println("Others="+(s.length()-c1-c2-1));
    }
}

