package 网易互联网.网易有道;


/**
 * @author Ren
 */

import java.util.*;

public class Main03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String s[] = str.split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.valueOf(s[i]);
        }
        Arrays.sort(arr);
        int num = 1, sum = 1;
        if (arr[0] == arr[arr.length - 1]) {
            System.out.println(arr.length);
        } else {

            if (arr.length == 0) {
                System.out.println(0);
            } else if (arr.length == 1) {
                System.out.println(1);
            } else {
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] == arr[i - 1]) {
                        if (num > 1) num = 1;
                        sum += num;
                    } else {
                        num++;
                        sum += num;
                    }
                }

                if (num == 1)
                    System.out.println(sum + 1);
                else System.out.println(sum);
            }
        }
    }
}
