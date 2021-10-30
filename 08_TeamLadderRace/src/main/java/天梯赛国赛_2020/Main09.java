package 天梯赛国赛_2020;

/**
 * @author Ren
 */

import java.util.*;

public class Main09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        Stack<Integer> q1 = new Stack<Integer>();
        Stack<String> q2 = new Stack<String>();

        for (int i = 0; i < m; i++) {
            q1.add(in.nextInt());
        }
        for (int i = 0; i < m-1; i++) {
            q2.add(in.next());
        }

        while (!q1.isEmpty()){
            int t1 = q1.pop();
            int t2 = q1.pop();
            String s = q2.pop();

            int res = getRes(t1,t2,s);
            if(!q1.isEmpty()){
                q1.push(res);
                //System.out.println(t2+s+t1);
            }else{
                System.out.println(res);
            }
        }

    }

    public static int getRes(int t1,int t2,String s){
        if("+".equals(s)){
            return t2+t1;
        }else if("-".equals(s)){
            return t2-t1;
        }else if("*".equals(s)){
            return t2*t1;
        }else{
            if(t1==0){
                System.out.println("ERROR: "+t2+"/0");
                System.exit(0);
            }else{
                return t2/t1;
            }
        }
        return 0;
    }
}
