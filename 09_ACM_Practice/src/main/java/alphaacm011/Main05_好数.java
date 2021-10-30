package alphaacm011;

/**
 * @author Ren
 */

import java.util.*;

public class Main05_好数 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.next();
        boolean ans = num.chars().allMatch(t -> num.charAt(0) == t);
        System.out.println(ans ? "YES" : "NO");
    }
}
