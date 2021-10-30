package 好未来.秋招2017_02;

/**
 * @author Ren
 */

import java.util.Scanner;

public class R02_删除公共字符 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String s = in.nextLine();
        for (int i = 0; i < s.length(); i++) {
            str = str.replaceAll(String.valueOf(s.charAt(i)), "");
        }
        System.out.println(str);
    }
}
