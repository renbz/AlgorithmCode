package 天梯赛国赛_2020;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans1 = 0;
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        int ans2 = 0;
        while (in.hasNext()){
            String str = in.nextLine();
            if(str.equals(".")) break;
            ans1++;
            if(!flag){
                if(str.contains("chi1 huo3 guo1")){
                    ans2 = ans1;
                    flag=true;
                }
            }
            sb.append(str);
        }


        String str = sb.toString();
        int len1 = str.length();
        String str2 = str.replaceAll("chi1 huo3 guo1","1234012340123");
        int len2 = str2.length();
        int ans3 = len1-len2;

        if(ans2==0 && ans3==0){
            System.out.println(ans1);
            System.out.println("-_-#");
        }else{
            System.out.println(ans1);
            System.out.println(ans2+" "+ans3);
        }

    }
}
