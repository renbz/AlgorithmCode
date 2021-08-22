package 爱奇艺;

/**
 * @author Ren
 */

import java.util.*;

public class Main03_象棋问题 {
    static boolean[] bool1, bool2, bool3;
    static int num;
    static List<List<String>> res = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Str = in.nextLine();
        int n = Integer.parseInt(Str.substring(2));
        NHuangHou(n);
        System.out.println(res.toString());

    }

    public static void NHuangHou(int n) {
        num = n;
        bool1 = new boolean[n];
        bool2 = new boolean[2 * n];
        bool3 = new boolean[2 * n];
        char[][] q = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(q[i], '.');
        }
        dfs(q, 0, new ArrayList<>());
    }

     private static void dfs(char[][] q, int row, ArrayList<String> myPath) {
        if (row == num) {
            res.add(new ArrayList<>(myPath));
            return;
        }
        char[] chars = q[row];
        for (int i = 0; i < num; i++) {
            if (!bool1[i] && !bool2[row + i] && !bool3[row - i + num]) {
                bool1[i] = bool2[row + i] = bool3[row - i + num] = true;
                chars[i] = 'Q';
                String tmp = String.valueOf(chars);
                myPath.add(tmp);
                dfs(q, row + 1, myPath);
                myPath.remove(myPath.size() - 1);
                bool1[i] = bool2[row + i] = bool3[row - i + num] = false;
                chars[i] = '.';
            }
        }
    }


}
