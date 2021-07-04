package 每日一题_2021_7月;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Ren
 */

public class R07_04_0645_错误的集合 {

    public int[] findErrorNums(int[] nums) {

        //找出nums中包含一个重复元素  和一个缺失元素
        //计算nums中的set和
        long sum1 = 0;
        long sum2 = 0;
        Set<Integer> set = new HashSet();

        for (int i : nums) {
            sum1 += i;
            set.add(i);
        }
        for (int i : set) sum2 += i;

        //重复元素
        long a = sum1 - sum2;
        long b = (1 + nums.length) * nums.length / 2 - sum2;
        return new int[]{(int) a, (int) b};
    }

}
