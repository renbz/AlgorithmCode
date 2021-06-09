package AlphaACM.test002;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {   // in.hasNext() 用于判断是否还有数据输入
            int n = in.nextInt();// 个数
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();// 分数
            }
            double sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < sum / n) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
