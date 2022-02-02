package 学习计划.剑指Offer专项突击版.Day12_13_栈;

import java.util.Stack;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/2 20:23
 * @Description:
 */

public class 剑指OfferII_040_矩阵中最大的矩形 {

    public int maximalRectangle(String[] matrix) {
        if (matrix == null || matrix.length == 0) return 0;
        int line = matrix[0].length();
        int[] heights = new int[line];
        int ans = 0;
        for (String row : matrix) {
            for (int i = 0; i < line; i++) {
                if (row.charAt(i) == '1') heights[i]++;
                else heights[i] = 0;
            }
            ans = Math.max(ans, largestRectangleArea(heights));
        }
        return ans;
    }


    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxArea = 0, len = heights.length;
        for (int i = 0; i < len; i++) {
            while (stack.peek() != -1 && heights[stack.peek()] >= heights[i]) {
                int h = heights[stack.pop()];
                int w = i - stack.peek() - 1;
                maxArea = Math.max(maxArea, h * w);
            }
            stack.push(i);
        }
        while (stack.peek() != -1) {
            int h = heights[stack.pop()];
            int w = len - stack.peek() - 1;
            maxArea = Math.max(maxArea, h * w);
        }
        return maxArea;
    }
}
