package 网易互联网;

/**
 * @author Ren
 */

import java.util.*;
public class Main01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int num = in.nextInt();
        String s [] = str.split(" ");
        int [] arr = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.valueOf(s[i]);
        }
        int count =0 ;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]<= num) count++;
            }
        }
        System.out.println(count);
    }


}
