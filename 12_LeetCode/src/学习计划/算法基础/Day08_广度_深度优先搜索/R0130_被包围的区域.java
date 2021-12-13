package 学习计划.算法基础.Day08_广度_深度优先搜索;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/12 11:51
 * @Description:
 */

public class R0130_被包围的区域 {

    /**
     * 思路分析: 任何在边界上或与边界上相连的'O'都不会被改变
     * 所以通过遍历边界字母将与其相连的’O‘变为临时字母'A’,然后将剩余的'O'变为X即可，'A'再变回’O‘
     *
     * @param board
     */
    int n, m;

    public void solve(char[][] board) {
        n = board.length;
        if (n == 0) return;
        m = board[0].length;
        for (int i = 0; i < n; i++) {
            dfs(board, i, 0);
            dfs(board, i, m - 1);
        }
        for (int i = 0; i < m; i++) {
            dfs(board,0,i);
            dfs(board,n-1,i);
        }

        //将剩余的’O‘变成’X‘
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j]=='O') board[i][j] = 'X';
                if(board[i][j]=='A') board[i][j] = 'O';
            }
        }

    }

    private void dfs(char[][] board, int i, int j) {
        if (i < 0 || i >= n || j < 0 || j >= m || board[i][j] != 'O') return;
        board[i][j] = 'A';
        dfs(board, i - 1, j);
        dfs(board, i + 1, j);
        dfs(board, i, j - 1);
        dfs(board, i, j + 1);
    }
}
