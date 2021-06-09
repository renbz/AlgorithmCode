package R03_5月3号;

/**
 * @author Ren
 */

import com.sun.javafx.robot.FXRobotImage;

import java.util.Scanner;

public class Main10_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();   //仓库个数
            int m = in.nextInt();   //工人个数
            int [] arr = new int[n];  //每个仓库的工人处理订单的情况
            int sum = 0;
            // 找出订单处理最大的那个仓库的人的订单处理量
            int max  = Integer.MIN_VALUE;
            int min  = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                sum += arr[i];
                max = arr[i]>max?arr[i]:max;
                min = arr[i]<min?arr[i]:min;
            }

            // 数组中的最大公约数为g
            int g = arr[0];
            // 找到这几个数的最大公约数
            for (int i = 0; i < n-1; i++) {
                g = gcd2(g,arr[i+1]);
            }
//            System.out.println("最大公约数: "+g);

            // 求出最小公倍数
            int minBS = 1;

            int [] arr_gcd = new int[n];

            for (int i = 0; i < n; i++) {
                arr_gcd[i] = arr[i]/g;
            }

            for (int i = 0; i < n; i++) {
                if(minBS % arr_gcd[i]!=0){
                    minBS = arr_gcd[i]*minBS;
                }
            }

//            System.out.println("得出最小公倍数: "+minBS);

            //求出对应的总人数
            int sum_t = 0;
            for (int i = 0; i < n; i++) {
                sum_t += minBS / arr_gcd[i];
            }
//            System.out.println("得出达成最小公倍数产量 至少需要的人数: "+sum_t);


            if(m%sum_t!=0){
                System.out.println("No");
                break;
            }

            // 求真实人数
            int mu = m/sum_t;



            int [] arr_res = new int[n];
            int sum3 = 0;
            for (int i = 0; i < n; i++) {
                arr_res[i] = mu * minBS/arr_gcd[i];
                sum3 += arr_res[i];
            }

//            System.out.println("分配方案的总和: "+sum3);

            if(sum3!=m){
                System.out.println("No");
                break;
            }


            System.out.println("Yes");
            for (int i = 0; i < n-1; i++) {
                System.out.print(arr_res[i]+" ");
            }
            System.out.println(arr_res[n-1]);
        }
    }

    public static int gcd2(int a, int b) {
        if (a == b) return a;
        if ((a & 1) == 0 && (b & 1) == 0) {
            return gcd2(a >> 1, b >> 1) << 1;
        } else {
            return gcd2(a > b ? a - b : b - a, a > b ? b : a);
        }
    }

}
