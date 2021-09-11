package 每日一题_2021_9月;

/**
 * @author Ren
 */

public class R09_11_0600_不含1的非负整数 {

    public int findIntegers(int n) {
        return 1 + dfs(1, n);  //0也是符合条件的，要加上1
    }

    public int dfs(int i, int n) {
        return i > n ? 0 : 1 + dfs(i << 1, n) + ((i & 1) == 1 ? 0 : dfs((i << 1) + 1, n));
    }
}
