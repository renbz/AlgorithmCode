package alphaacm011;

/**
 * @author Ren
 */

import java.util.*;

public class Main04_冲钻五 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int x = 0; x < T; x++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int ans = 0;
            int wins = 0;
            String s = in.next();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'W') {
                    if (wins >= 2) ans += k;
                    else ans++;
                    wins++;
                } else {
                    wins = 0;
                    ans--;
                }
            }
            System.out.println(ans);
        }
    }
}
