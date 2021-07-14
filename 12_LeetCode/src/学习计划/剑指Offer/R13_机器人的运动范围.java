package 学习计划.剑指Offer;

/**
 * @author Ren
 */

public class R13_机器人的运动范围 {


    /**
     * @param m  格子m行n列，下标 m,n
     * @param n
     * @param k
     * @return
     */
    boolean[][] memory;
    int count = 0;

    public int movingCount(int m, int n, int k) {
        if (m * n == 0) return 0;
        memory = new boolean[m][n];
        dfs(0, 0, m, n, k);
        return count;
    }

    public void dfs(int i, int j, int m, int n, int k) {
        if (i + 1 <= m && j + 1 <= n && memory[i][j] == false) {
            memory[i][j] = true;

            if (check(i, j, k)) {
                count++;
                dfs(i + 1, j, m, n, k);
                dfs(i, j + 1, m, n, k);
            }

        }

    }

    public boolean check(int i, int j, int kk) {
        StringBuilder builder = new StringBuilder();
        builder.append(i).append(j);
        int sum = 0;
        for (int k = 0; k < builder.length(); k++) {
            sum += Integer.parseInt(String.valueOf(builder.charAt(k)));
        }
        return sum <= kk;
    }

}
