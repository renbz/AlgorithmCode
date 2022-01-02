package LeetCode周赛.第274场;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/2 10:45
 * @Description:
 */

public class R5969_摧毁小行星 {

    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        BigInteger big = BigInteger.valueOf(mass);
        for (int i = 0; i < asteroids.length; i++) {
            BigInteger t = BigInteger.valueOf(asteroids[i]);
            if (big.compareTo(t) >= 0) big = big.add(t);
            else return false;
        }
        return true;
    }

}
