package Other;

/**
 * @author Ren
 */

public class R0240_搜索二维矩阵 {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        int i = 0, j = matrix[0].length - 1;
        while (j >= 0 && i < matrix.length) {
            if (matrix[i][j] == target) return true;
            if (matrix[i][j] > target) j--;
            if (j < 0) return false;
            if (matrix[i][j] < target) i++;
        }
        return false;
    }

}
