package 学习计划.算法.算法基础.Day11_递归_回溯;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/30 20:40
 * @Description:
 */

public class R0079_单词搜索 {
    public static void main(String[] args) {
        R0079_单词搜索 obj = new R0079_单词搜索();
        System.out.println(obj.exist(new char[][]{{'C', 'C', 'C'}, {'A', 'A', 'C'}, {'B', 'C', 'D'}}, "AAB"));
    }

    int[][] a = new int[][]{{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
    int m, n;

    public boolean exist(char[][] board, String word) {
        this.m = board.length;
        this.n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, i, j, word, 0)) return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int i, int j, String word, int index) {
        char c = board[i][j];
        board[i][j] = '#';
        if (index == word.length() - 1) return true;
        for (int[] ints : a) {
            int _i = i + ints[0];
            int _j = j + ints[1];
            if (_i >= 0 && _i < m && _j >= 0 && _j < n && board[_i][_j] == word.charAt(index + 1)) {
                boolean flag = dfs(board, _i, _j, word, index + 1);
                if (flag) return true;
            }
        }
        board[i][j] = c;
        return false;
    }

}
