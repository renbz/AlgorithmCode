package 好未来.秋招2017_02;

/**
 * @author Ren
 */

import java.util.*;

public class R03_求和 {

    static int n, m;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        f(new ArrayList<Integer>(), 0, 1);
    }

    public static void f(ArrayList<Integer> list, int sum, int num) {
        if (sum == m) {
            printAns(list);
        } else {
            if (num <= n) {
                ArrayList<Integer> newList = (ArrayList<Integer>) list.clone();
                list.add(num);
                f(list, sum + num, num + 1);

                f(newList, sum, num + 1);
            }
        }
    }
    public static void printAns(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i == list.size() - 1 ? list.get(i) + "\n" : list.get(i) + " ");
        }
    }
}
