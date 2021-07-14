package 学习计划.剑指Offer;

/**
 * @author Ren
 */

public class R29_顺序打印矩阵 {


    int index = 0;
    int[] ans ;

    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length==0 || matrix[0].length==0) return new int[0];

        int rowNum = matrix.length;
        int columnNum = matrix[0].length;

        ans = new int[rowNum*columnNum];
        int top = 0;
        int right = matrix[0].length - 1;
        int down = matrix.length - 1;
        int left = 0;
        while (top <= down && left <= right) {
            print(top, right, down, left, matrix);
            top++;
            left++;
            right--;
            down--;
        }
        return ans;
    }

    public void print(int top, int right, int down, int left, int[][] matrix) {

        int _left = left;
        int _right = right;
        int _top = top;
        int _down = down;
        // 左->右
        while (_left <= right) {
            ans[index] = matrix[top][_left];
            index++;
            _left++;
        }
        // 上->下
        _top++;
        while (_top < down ) {
            ans[index] = matrix[_top][right];
            index++;
            _top++;
        }
        // 右->左
        while (_right >= left && top!=down) {
            ans[index] = matrix[down][_right];
            index++;
            _right--;
        }
        // 下->上
        _down--;
        while (_down > top && left!=right) {
            ans[index] = matrix[_down][left];
            index++;
            _down--;
        }
    }
}
