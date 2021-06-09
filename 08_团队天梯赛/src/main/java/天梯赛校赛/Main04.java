package 天梯赛校赛;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main04 {

    static int[][] arr;
    static int x1,y1,l1,x2,y2,l2,m;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        while (k-->0){
            x1 = in.nextInt();
            y1 = in.nextInt();
            l1 = in.nextInt();

            x2 = in.nextInt();
            y2 = in.nextInt();
            l2 = in.nextInt();


            m = l1+l2+x1+x2+y1+y2;
            arr = new int[m][m];
            tt(x1,y1,l1);
            tt(x2,y2,l2);
            judgeAndPrint();

        }



    }

    public static void tt(int x, int y, int f) {
        int up = x - (f / 2);
        if (x - (f / 2) < 0) up = 0;
        int down = x + (f / 2);
        if (x + (f / 2) >= m) down = m - 1;

        int left = y - (f / 2);
        if (y - (f / 2) < 0) left = 0;

        int right = y + (f / 2);
        if (y + (f / 2) >= m) right = m - 1;

        for (int i = up; i <= down; i++) {
            for (int j = left; j <= right; j++) {
                arr[i][j] = arr[i][j]+1;
            }
        }
    }

    public static void judgeAndPrint(){
        boolean ff = true;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                //System.out.print(arr[i][j]+"  ");
                if (arr[i][j] == 2) {
                    ff = false;
                }
            }
            //System.out.println();
        }

        if (ff) {
            System.out.println("Happy");
        } else {
            System.out.println("Angry");
        }
    }
}
