package alphaacm009;

/**
 * @author Ren
 */
import java.util.*;
public class Main06_回文 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int len = s.length();
        boolean flag = false;
        for (int i = 0; i < len/2; i++) {
            if(s.charAt(i)!=s.charAt(len-i-1)) flag= true;
        }
        System.out.println(flag?"NO":"YES");
    }
}
