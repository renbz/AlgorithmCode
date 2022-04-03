package 学习计划.编程能力.编程能力入门.Day11_容器_库;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/3 15:28
 * @Description:
 */

public class R1356_根据数字二进制下1的数目排序 {

    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += Integer.bitCount(arr[i]) * 100000;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 100000;
        }
        return arr;
    }

}
