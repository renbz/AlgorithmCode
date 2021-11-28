package AlphaACM.match02;

/**
 * @author Ren
 */

import java.util.*;

public class Main_H_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int m = s.length();
        while (s.length() > 0 && m>s.length()) {
            m=s.length();
            s = s.replace("ab", "");
        }
        System.out.println(s.length()==0 ? "Good" : "Bad");
    }
}
