package alphaacm009;

import java.util.Scanner;

/**
 * @author Ren
 */
public class Main05_排序期望 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), sum = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            if (arr[t] == 0) {
                arr[t] = 1;
                sum++;
            }
        }
        System.out.println(sum);
    }
}
