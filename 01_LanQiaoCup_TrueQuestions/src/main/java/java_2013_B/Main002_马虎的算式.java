package java_2013_B;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ren
 */

public class Main002_马虎的算式 {
    public static void main(String[] args) {
        int ans = 0;
        for (int i = 12; i <= 98; i++) {
            for (int j = 123; j < 987; j++) {
                String t1 = String.valueOf(i);
                String t2 = String.valueOf(j);
                int n1 = Integer.parseInt("" + t1.charAt(0) + t2.charAt(1) + t1.charAt(1));
                int n2 = Integer.parseInt("" + t2.charAt(0) + t2.charAt(2));
                if (i * j == n1 * n2 && isSame(t1, t2)) {
                    //System.out.println(t1+"    "+t2);
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
    private static boolean isSame(String t1, String t2) {
        Set<Character> set = new HashSet<>();
        set.add(t1.charAt(0));
        set.add(t1.charAt(1));
        set.add(t2.charAt(0));
        set.add(t2.charAt(1));
        set.add(t2.charAt(2));
        if (t1.contains("0") || t2.contains("0") || set.size() < 5) return false;
        return true;
    }

}
