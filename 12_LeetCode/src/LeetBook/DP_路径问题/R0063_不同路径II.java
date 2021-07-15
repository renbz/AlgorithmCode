package LeetBook.DP_路径问题;

import javax.jws.Oneway;

/**
 * @author Ren
 */

public class R0063_不同路径II {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0]==1) return 0;
        obstacleGrid[0][0] = 1;
        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[0].length; j++) {
                if (obstacleGrid[i][j] == 1 &&( i!=0 || j!=0)) {
                    obstacleGrid[i][j] = 0;
                } else if (i > 0 && j > 0) {
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                } else if (i > 0) {
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j];
                } else if (j > 0) {
                    obstacleGrid[i][j] = obstacleGrid[i][j - 1];
                }
            }
        }
        return obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }

}
