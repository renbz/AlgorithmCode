package R02_4月11号;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main09_2 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        while (k-->0){
            int a = in.nextInt();
            int b = in.nextInt();

            int [] arr = new int[b+a+3];
            arr[a+1]=1;
            arr[a+2]=2;
            for (int i = a+3; i <=b ; i++) {
                arr[i]=arr[i-1]+arr[i-2];
            }

            System.out.println(arr[b]);
        }
    }

}
