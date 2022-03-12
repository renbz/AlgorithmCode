package 美团.R2022_03_12;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/12 17:03
 * @Description:
 */

import java.util.*;

public class Main003 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }


        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= m; i++) {
            set.add(i);
        }
        int ans = 0;
        Arrays.sort(arr, (o1, o2) -> o1[0] == o2[0] ? o2[1] - o1[1] : o2[0] - o1[0]);
        for (int[] ints : arr) {
            if (set.contains(ints[0]) && set.contains(ints[1])) {
                ans++;
                set.remove(ints[0]);
                set.remove(ints[1]);
            }
        }
        System.out.println(ans);
    }

}
