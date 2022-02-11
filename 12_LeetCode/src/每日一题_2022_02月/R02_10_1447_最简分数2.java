package 每日一题_2022_02月;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/10 11:05
 * @Description:
 */

public class R02_10_1447_最简分数2 {

    List<String> ans = new ArrayList();
    public List<String> simplifiedFractions(int n) {
        for (int i = 2; i < n + 1; ++i) {
            util(i);
        }
        return ans;
    }

    public void util(int n) {
        int up = n - 1;
        int down = n;
        while (up > 0) {
            if (gcd(down, up) == 1) {
                ans.add(up + "/" + down);
            }
            up--;
        }
    }

    public int gcd(int a, int b){
        if (b==0){
            return a;
        }
        return gcd(b,a%b);
    }

}
