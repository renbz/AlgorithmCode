package 每日一题_2021_12月;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/20 11:17
 * @Description:
 */

public class R12_20_0475_供暖器 {

    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int l = 0, r = (int) 1e9;
        while (l < r) {
            int mid = l + r >> 1;
            if (check(houses, heaters, mid)) r = mid;
            else l = mid + 1;
        }
        return r;
    }

    boolean check(int[] houses, int[] heaters, int x) {
        int ho_len = houses.length, he_len = heaters.length;
        for (int i = 0, j = 0; i < ho_len; i++) {
            while (j < he_len && houses[i] > heaters[j] + x) j++;
            if (j < he_len && houses[i] >= heaters[j] - x && houses[i] <= heaters[j] + x) continue;
            return false;
        }
        return true;
    }

}
