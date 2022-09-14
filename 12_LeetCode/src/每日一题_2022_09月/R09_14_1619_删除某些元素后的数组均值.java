package 每日一题_2022_09月;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/9/14 20:27
 * @Description:
 */

public class R09_14_1619_删除某些元素后的数组均值 {

    public double trimMean(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int partialSum = 0;
        for (int i = n / 20; i < 19 * n / 20; i++) {
            partialSum += arr[i];
        }
        return partialSum / (n * 0.9);
    }

}
