package Other;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren
 */

public class R0054_螺旋矩阵 {

    List<Integer> list = new ArrayList<>();
    public List<Integer> spiralOrder(int[][] matrix) {

        if(matrix.length==0 || matrix[0].length==0) return list;

        int rowNum = matrix.length;
        int columnNum = matrix[0].length;

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
        return list;

    }
    public void print(int top, int right, int down, int left, int[][] matrix) {

        int _left = left;
        int _right = right;
        int _top = top;
        int _down = down;
        // 左->右
        while (_left <= right) {
            list.add(matrix[top][_left]);
            _left++;
        }
        // 上->下
        _top++;
        while (_top < down ) {
            list.add(matrix[_top][right]);
            _top++;
        }
        // 右->左
        while (_right >= left && top!=down) {
            list.add(matrix[down][_right]);

            _right--;
        }
        // 下->上
        _down--;
        while (_down > top && left!=right) {
            list.add(matrix[_down][left]);
            _down--;
        }
    }

}
