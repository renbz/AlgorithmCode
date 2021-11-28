package AlphaACM.match_11_27;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/11/28 11:03
 * @Description:
 */
import java.util.*;
public class Main_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 2; i <= n; i++) {
            if(isPNum(i)) System.out.print(i+" ");
        }
    }
    static boolean isPNum(int num){
        for (int i = 2; i <= num / 2; i++) {
            if(num%i==0) return false;
        }
        return true;
    }
}
