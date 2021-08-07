package 好未来.秋招2017_02;

/**
 * @author Ren
 */
import java.util.*;
public class R01_倒置字符串 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] s = str.split(" ");
        for (int i = s.length-1; i >0 ; i--) {
            System.out.print(s[i]);
            System.out.print(" ");
        }
        System.out.println(s[0]);
    }
}
