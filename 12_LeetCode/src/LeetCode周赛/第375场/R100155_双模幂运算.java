package LeetCode周赛.第375场;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2023/12/10 10:36
 * @Description:
 */

public class R100155_双模幂运算 {

    public List<Integer> getGoodIndices(int[][] variables, int target) {
        BigInteger targetB = BigInteger.valueOf(target);
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < variables.length; i++) {
            BigInteger ai = BigInteger.valueOf(variables[i][0]);
            int bi = variables[i][1];
            int ci = variables[i][2];
            BigInteger mi = BigInteger.valueOf(variables[i][3]);
            if (ai.pow(bi).mod(BigInteger.valueOf(10)).pow(ci).mod(mi).compareTo(targetB) == 0) {
                ans.add(i);
            }
        }
        return ans;

    }

}
