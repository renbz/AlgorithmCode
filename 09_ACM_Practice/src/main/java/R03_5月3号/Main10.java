package R03_5月3号;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main10 {
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

            System.out.println("最大公约数: "+g);
            //每个仓库的工人处理的订单 %最大公约数  然后相加
            int sum2 = 0;
            for (int i = 0; i < n; i++) {
                sum2+= arr[i]/g;
            }
            System.out.println("仓库产量mod最大公约数后的和: "+sum2);

           /* if(m%sum2!=0){
                System.out.println("No");
                break;
            }*/

            //得出分配后每个仓库的平均产出
            int avgPut = m*max/sum2;
            System.out.println("分配后每个仓库的产量: "+avgPut);

            int [] arr_res = new int[n];
            int sum3 = 0;
            for (int i = 0; i < n; i++) {
                arr_res[i] = avgPut/arr[i];
                sum3 += arr_res[i];
            }
            System.out.println("分配方案的总和: "+sum3);
            if(sum3!=m){
                System.out.println("No");
                break;
            }

            for (int i = 0; i < n; i++) {
                if(arr_res[i]*arr[i] != avgPut){
                    System.out.println("No");
                    break;
                }
            }

            System.out.println("Yes");
            for (int i = 0; i < n; i++) {
                System.out.print(arr_res[i]+" ");
            }
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
