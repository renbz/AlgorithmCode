package 每日一题_2022_08月;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author renbingzhang
 * @Date: 2022/8/24 14:21
 * @Description:
 */

public class R08_24_1460_通过翻转子数组使两个数组相等 {

    public boolean canBeEqual(int[] target, int[] arr) {
        // 比较两数组是否相等
        Set<Integer> set = new HashSet<>();
        if (target.length != arr.length) return false;
        // 排序
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < target.length; i++) {
            if (target[i] != arr[i]) return false;
        }
        return true;
    }

}
