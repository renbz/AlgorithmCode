package 美团.R2022_03_12;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/12 16:22
 * @Description:
 */

import java.util.*;

public class Main002 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), ans = 0;
        int[] nums = new int[n];
        int[] count = new int[n + 1];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            if (nums[i - 1] == -1) count[i] = count[i - 1] + 1;
            else count[i] = count[i - 1];
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                if (i == j) {
                    if (nums[i - 1] == 1) ans++;
                } else {
                    if ((count[j] - count[i - 1]) % 2 == 0) ans++;
                }
            }
        }
        System.out.println(ans);
    }

}
