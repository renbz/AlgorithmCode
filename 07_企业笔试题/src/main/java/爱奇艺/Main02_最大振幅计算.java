package 爱奇艺;

/**
 * @author Ren
 */

import java.util.*;

public class Main02_最大振幅计算 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            String[] s = str.split(",");
            int[] a = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                a[i] = Integer.valueOf(s[i]);
            }

            //最大值 最小值 差值
            int max = a[0], min = a[0], mu = 0;
            for (int i = 1; i < a.length; i++) {
                if (a[i] > a[i - 1]) {
                    max = max > a[i] ? max : a[i];

                }else{
                    min = a[i];
                }
                if(a[i]<a[i-1]){
                    min = min<a[i]?min:a[i];
                }
                mu = mu > max - min ? mu : max - min;
            }
            System.out.println(mu);
        }
    }

}
