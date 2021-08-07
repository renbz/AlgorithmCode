package 好未来.秋招2017_01;

/**
 * @author Ren
 */

import java.util.HashMap;
import java.util.Scanner;
public class R03_n个数里出现次数大于等于一半的数2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] ans = str.split(" ");
        int n = ans.length;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(ans[i], map.getOrDefault(ans[i], 0) + 1);
            if(map.get(ans[i])==n/2){
                System.out.println(ans[i]);
                break;
            }
        }
    }
}
