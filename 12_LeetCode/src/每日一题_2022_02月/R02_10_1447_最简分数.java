package 每日一题_2022_02月;

import java.util.*;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/10 11:05
 * @Description:
 */

public class R02_10_1447_最简分数 {

    public List<String> simplifiedFractions(int n) {
        Set<String> set = new HashSet<>();
        List<String> ans = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                // 判断i和j是否有公约数
                if (set.add(getEasy(i, j))) ans.add(getEasy(i, j));
            }
        }
        return ans;
    }

    String getEasy(int i, int j) {
        int gcd_ = gcd(i, j);
        if (gcd_ != 1) {
            return new StringBuilder().append(j / gcd_).append("/").append(i / gcd_).toString();
        }
        return new StringBuilder().append(j).append("/").append(i).toString();
    }

    int gcd(int i, int j) {
        return j == 0 ? i : gcd(j, i % j);
    }

}
