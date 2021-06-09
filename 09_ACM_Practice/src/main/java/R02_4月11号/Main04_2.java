package R02_4月11号;

/**
 * @author Ren
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main04_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int c = 0;
        while (true) {
            int a = in.nextInt();
            int b = in.nextInt();
            int k = b;
            if (a == 0 && b == 0) return;

            int[] arr = new int[b];
            for (int i = 0; i < b; i++) {
                arr[i] = in.nextInt();
            }

            Arrays.sort(arr);

            int [] arr2 = new int[b];


            //获取对方的牌
            int index1 = 0, index2 = 0;
            for (int i = a * b - 2 * b+1; i <= a * b; i++) {
                if (arr[index1] == i) {
                    index1++;
                }else{
                    arr2[index2]=i;
                    index2++;
                }
            }

            int count = 0;
            int i1r=b-1,i2r=b-1,i2l=0;
            while (k-->0){
                if(arr[i1r]>arr2[i2r]){
                    count++;
                    i1r--;
                    i2l++;
                }else if(arr[i1r]<arr2[i2r]){
                    i1r--;
                    i2r--;
                }
            }



            System.out.println("Case " + ++c + ": " + count);
        }
    }

}