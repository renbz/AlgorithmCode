package 好未来.秋招2017_01;

/**
 * @author Ren
 */

import java.util.*;

public class R03_n个数里出现次数大于等于一半的数 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] ans = str.split(" ");
        int n = ans.length;
        Arrays.sort(ans);
        System.out.println(ans[n / 2]);
    }
}
