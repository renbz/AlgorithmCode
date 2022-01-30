package 学习计划.剑指Offer专项突击版.Day12_13_栈;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/30 23:37
 * @Description:
 */

public class 剑指OfferII_038_每日温度 {

    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new LinkedList<>();
        int[] ans = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int index = stack.pop();
                ans[index] = i - index;
            }
            stack.push(i);
        }
        return ans;
    }

}
