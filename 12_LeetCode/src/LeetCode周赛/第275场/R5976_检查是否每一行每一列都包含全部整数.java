package LeetCode周赛.第275场;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/9 10:30
 * @Description:
 */

public class R5976_检查是否每一行每一列都包含全部整数 {

    public boolean checkValid(int[][] matrix) {
        int len = matrix.length;
        //1-len的和
        long sum = (1 + len) * len / 2;
        int[] count = new int[len + 1];
        Arrays.fill(count, 2 * len);

        for (int i = 0; i < len; i++) {
            long ssum1 = 0L, ssum2 = 0L;
            for (int j = 0; j < len; j++) {
                ssum1 += matrix[i][j];
                ssum2 += matrix[j][i];
                count[matrix[i][j]]--;
            }
            if (sum != ssum1 || sum != ssum2) return false;
        }
        for (int i = 1; i <= len; i++) {
            if (count[i] != 0) return false;
        }
        return true;

    }

}
