package 每日一题_2022_01月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/1 10:37
 * @Description:
 */

public class R01_01_2022_将一维数组转变成二维数组 {

    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][];
        }
        int[][] ans = new int[m][n];
        for (int i = 0; i < original.length; i+=n) {
            System.arraycopy(original,i,ans[i/n],0,n);
        }
        return ans;
    }

}
