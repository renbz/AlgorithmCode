package 哔哩哔哩;

import java.util.*;
/**
 * @author Ren
 */

public class Main02_顺时针打印数字矩阵 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int m = in.nextInt();
            int n =in.nextInt();
            if (m==-1 && n==-1) break;
            list = new ArrayList<>();
            int [][] arr = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = in.nextInt();
                }
            }
            List<Integer> list = printX(arr);
            for (int i = 0; i < list.size()-1; i++) {
                System.out.print(list.get(i)+",");
            }
            System.out.println(list.get(list.size()-1));
        }


    }
    static List<Integer> list = new ArrayList<>();
    public static List<Integer> printX(int[][] matrix) {
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
    public static void print(int top, int right, int down, int left, int[][] matrix) {

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
