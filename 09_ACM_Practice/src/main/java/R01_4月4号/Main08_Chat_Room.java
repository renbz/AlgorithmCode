package R01_4月4号;

/**
 * @author Ren
 * 公共做序列问题
 */

import java.util.Scanner;

public class Main08_Chat_Room {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str  = in.next();
        String target = "hello";

        int index1 = str.indexOf('h');
        int index2 = str.indexOf('e',index1+1);
        int index3 = str.indexOf('l',index2+1);
        int index4 = str.indexOf('l',index3+1);
        int index5 = str.lastIndexOf('o');

        if(index1<index2 && index2<index3 && index3<index4 && index4<index5){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
