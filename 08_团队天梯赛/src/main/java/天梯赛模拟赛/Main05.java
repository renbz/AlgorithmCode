package 天梯赛模拟赛;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String  str = in.nextLine();

        int count = 0;
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if(flag){
                count=0;
            }
            if(str.charAt(i)=='6'){
                count++;
            }
            if((i!=str.length()-1 && str.charAt(i+1)!='6'&& count>=9 )  ||  (count>=9&&i==str.length()-1) ){
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < count; j++) {
                    sb.append("6");
                }
                str.replaceAll(sb.toString(),"27");
                i=0;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if(flag){
                count=0;
            }
            if(str.charAt(i)=='6'){
                count++;
            }
            if((i!=str.length()-1 && str.charAt(i+1)!='6'&& count>=4 )  ||  (count>=4&&i==str.length()-1)){
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < count; j++) {
                    sb.append("6");
                }
                str.replaceAll(sb.toString(),"9");
                i=0;
            }
        }
        System.out.println(str);

    }
}
