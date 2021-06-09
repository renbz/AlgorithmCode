package 天梯赛模拟赛;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main06 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int k = in.nextInt();

        while (k-->0){
            int n = in.nextInt();
            boolean flag = false;
            int res = -1;
            for (int i = 2; i <=9; i++) {
                String str = (n*i)+"";
                int t = 0;
                for (int j = 0; j < str.length(); j++) {
                    t+=Integer.parseInt(str.charAt(j)+"");
                }
                if(t!=res && res!=-1){
                    flag = true;
                }
                res = t;
            }

            if(!flag){
                System.out.println(res);
            }else{
                System.out.println("No");
            }
        }


    }
}
