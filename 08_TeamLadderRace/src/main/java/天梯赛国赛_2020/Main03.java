package 天梯赛国赛_2020;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double ans = 0;
        if(b==0){
            ans = a*2.455;
        }else{
            ans = a*1.26;
        }
        String str = String.format("%.2f",ans);
        if(ans>=c){

            System.out.println(str+" T_T");
        }else{
            System.out.println(str+" ^_^");
        }
    }
}
