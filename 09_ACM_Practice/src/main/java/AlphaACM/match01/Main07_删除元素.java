package AlphaACM.match01;

/**
 * @author Ren
 */

import java.util.*;
public class Main07_删除元素 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()){
            int n = in.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            long target = in.nextInt();

            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if(arr[i]==target && flag){
                    flag = false;
                }else{
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();

        }
    }
}
