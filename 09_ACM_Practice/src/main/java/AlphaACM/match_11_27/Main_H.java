package AlphaACM.match_11_27;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/11/28 11:30
 * @Description:
 */
import java.util.*;
public class Main_H {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int sum = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a') sum++;
            if(s.charAt(i)=='b') sum--;
            if(sum<0){
                ans="Bad";
                break;
            }
        }
        if(ans.length()>0 || sum!=0){
            System.out.println("Bad");
        }else{
            System.out.println("Good");
        }
    }
}
