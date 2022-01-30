package 学习计划.剑指Offer专项突击版.Day12_13_栈;

import java.util.*;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/30 22:55
 * @Description:
 */

public class 剑指OfferII_037_小行星碰撞 {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        int p = 0;
        while (p < asteroids.length) {
            if (s.empty() || s.peek() < 0 || asteroids[p] > 0) {
                s.push(asteroids[p]);
            } else if (s.peek() <= -asteroids[p]) {
                if (s.pop() < -asteroids[p]) continue;
            }
            p++;
        }
        int[] ret = new int[s.size()];
        for (int i = ret.length - 1; i >= 0; i--) {
            ret[i] = s.pop();
        }
        return ret;
    }

}
