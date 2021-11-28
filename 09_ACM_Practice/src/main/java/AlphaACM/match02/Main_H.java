package AlphaACM.match02;

/**
 * @author Ren
 */
import java.util.*;
public class Main_H {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int sum = 0 ;
        String ans = "";
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a') sum++;
            if(s.charAt(i)=='b') sum--;
            if(sum<0){
                ans = "Bad";
                break;
            }
        }
        System.out.println(ans.length()>0?ans:"Good");
    }
}