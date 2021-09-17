package 字节跳动.R_2019春招_problems2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Ren
 */
public class R01_万万没想到之聪明的编辑 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        while (k-- > 0) {
            String str = in.next();
            char[] c = str.toCharArray();
            ArrayList<Character> list = new ArrayList<>();
            for (int i = 0; i < c.length; i++) {
                list.add(c[i]);
            }
            for (int i = 0; i < list.size() - 2; i++) {
                if (list.get(i).equals(list.get(i + 1)) && list.get(i).equals(list.get(i + 2))) {
                    list.remove(i);
                    i = 0;
                }
                if (i < list.size() - 3) {
                    if (list.get(i).equals(list.get(i + 1)) && list.get(i + 2).equals(list.get(i + 3))) {
                        list.remove(i + 2);
                        i = 0;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i));
            }
            System.out.println(sb.toString());
        }
    }
}
