package 顺丰科技;

/**
 * @author Ren
 */

import java.util.*;

public class Main01_分数计算 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i]=in.nextInt();
        }
        int n = in.nextInt();
        int [][] arr = new int[n][5];
        int [] res = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = in.nextInt();
                res[i]+= a[j]*arr[i][j];
            }
        }

        //寻找最高分
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = max>res[i]?max:res[i];
        }

        //判断有几个最高分
        int count =0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(res[i]==max){
                count++;
                list.add(i+1);
            }
        }
        System.out.println(max);
        System.out.println(count);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}
