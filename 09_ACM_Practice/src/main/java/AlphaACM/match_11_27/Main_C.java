package AlphaACM.match_11_27;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/11/28 11:14
 * @Description:
 */
import java.util.*;
public class Main_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0){
            int n = in.nextInt();
            System.out.println((int)Math.pow(2,n-1));
        }
    }
}
