package AlphaACM.match01;

/**
 * @author Ren
 */
import java.util.*;
public class Main03_字符统计 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        Set set = new HashSet();

        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i)>'0' && str.charAt(i)<'9')
                ||(str.charAt(i)>'a' && str.charAt(i)<'z')
                ||(str.charAt(i)>'A' && str.charAt(i)<'Z')
            ){
                set.add(str.charAt(i));
            }
        }
        System.out.println(set.size());

    }

}
