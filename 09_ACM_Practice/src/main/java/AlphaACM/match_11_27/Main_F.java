package AlphaACM.match_11_27;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/11/28 11:19
 * @Description:
 */
import java.util.*;
public class Main_F {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Set set = new HashSet();
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            if(set.add(t)) System.out.print(t+" ");
        }
    }
}
