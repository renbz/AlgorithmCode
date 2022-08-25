package 每日一题_2022_08月;

import java.util.ArrayList;
import java.util.List;

/**
 * @author renbingzhang
 * @Date: 2022/8/24 13:38
 * @Description:
 */

public class R08_25_0658_找到K个最接近的元素 {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        // 二分法找到最接近x的索引
        int r = binarySearch(arr, x);
        // 双指针比较依次填充答案
        List<Integer> ans = new ArrayList<>();
        int l = r - 1;
        while (k-- > 0) {
            if (l < 0) {
                r++;
            } else if (r >= arr.length) {
                l--;
            } else if (x - arr[l] <= arr[r] - x) {
                l--;
            } else {
                r++;
            }
        }
        for (int i = l+1; i < r; i++) {
            ans.add(arr[i]);
        }
        return ans;
    }

    public int binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] >= x) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

}
