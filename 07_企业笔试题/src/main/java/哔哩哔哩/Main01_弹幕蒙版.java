package 哔哩哔哩;

/**
 * @author Ren
 */

import java.util.*;

public class Main01_弹幕蒙版 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        ArrayList<String> list = new ArrayList<>();
        while (in.hasNext()) {
            String str = in.nextLine();
            list.add(str);
            if (str.substring(str.length() - 2, str.length()).equals("]]")) {
                int m = list.size();
                String [][] arr = new String[m][];
                for (int i = 0; i < m; i++) {
                    String s = list.get(i);
                    s= s.replaceAll("\\[","");
                    s= s.replaceAll("]","");
                    arr[i] = s.split(",");
                }

                int ans = maxCount(arr);
                System.out.println(ans);
            }
        }

    }
    public static int maxCount( String[][] arr ){
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j].equals("1")){
                    res = Math.max(res,dfs(i,j,arr));
                }
            }
        }
        return res;
    }

    private static int dfs(int i, int j, String[][] arr) {
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j].equals("0")) return 0;
        arr[i][j]="0";
        int num = 1;
        num += dfs(i+1,j,arr);
        num += dfs(i-1,j,arr);
        num += dfs(i,j+1,arr);
        num += dfs(i,j-1,arr);
        return num;
    }

}
