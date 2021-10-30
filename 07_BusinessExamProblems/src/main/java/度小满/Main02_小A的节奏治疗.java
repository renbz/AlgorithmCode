package 度小满;

/**
 * @author Ren
 */
import java.util.*;
public class Main02_小A的节奏治疗 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int t = in.nextInt();
        while (t-->0){
            String str = in.next();
            boolean b = false;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='O' || str.charAt(i)=='0') continue;
                else{
                    b = true;
                    System.out.println("NO");
                    break;
                }
            }
            if(!b){
                System.out.println("YES");
            }
        }
    }

}
