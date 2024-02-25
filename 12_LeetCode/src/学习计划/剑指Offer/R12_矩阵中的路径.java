package 学习计划.剑指Offer;

/**
 * @author Ren
 */

public class R12_矩阵中的路径 {

    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(dfs(board, word, i, j, 0)) return true;
            }
        }
        return false;
    }

    /**
     *
     * @param board
     * @param word
     * @param i
     * @param j
     * @param k  当前遍历到了word的第几个字符
     * @return
     */
    boolean dfs(char[][] board, String word, int i, int j, int k) {

        if(i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word.charAt(k)) return false;
        if(k == word.length() - 1) return true;
        board[i][j] = '*'; //递归前
        boolean res = dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i - 1, j, k + 1) ||
                dfs(board, word, i, j + 1, k + 1) || dfs(board, word, i , j - 1, k + 1);
        board[i][j] = word.charAt(k); // 回溯
        return res;
    }
}
