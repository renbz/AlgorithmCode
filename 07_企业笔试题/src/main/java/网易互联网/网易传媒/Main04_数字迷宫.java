package 网易互联网.网易传媒;

/**
 * @author Ren
 */

import java.util.*;

public class Main04_数字迷宫 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // a代价 消除障碍    b代价传送门
        int n = in.nextInt(), a = in.nextInt(), b = in.nextInt();
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.next().toCharArray();
        }
        //判断是否有门
        boolean haveDoor = isHaveDoor(arr, n);
        if(haveDoor){
            //起点到门的最小代价

            //终点到门的最小代价

        }
        //不走门



    }

    static boolean isHaveDoor(char[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == '#') return true;
            }
        }
        return false;
    }

}
