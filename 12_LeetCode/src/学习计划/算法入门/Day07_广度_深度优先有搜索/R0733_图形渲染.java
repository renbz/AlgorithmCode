package 学习计划.算法入门.Day07_广度_深度优先有搜索;

/**
 * @author Ren
 */

public class R0733_图形渲染 {
    int[][] newImage;
    int lenR, lenC, newColor, backColor;

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        //深度优先搜索
        if (image[sr][sc] == newColor) return image;
        newImage = image;
        lenR = image.length;
        lenC = image[0].length;
        this.newColor = newColor;
        backColor = image[sr][sc];
        dfs(sr, sc);
        return newImage;
    }

    public void dfs(int r, int c) {
        if (newImage[r][c] != backColor) return;
        newImage[r][c] = newColor;
        if (r > 0) dfs(r - 1, c);
        if (r < lenR - 1) dfs(r + 1, c);
        if (c > 0) dfs(r, c - 1);
        if (c < lenC - 1) dfs(r, c + 1);
    }

}
