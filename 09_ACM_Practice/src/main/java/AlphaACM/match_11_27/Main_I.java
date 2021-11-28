package AlphaACM.match_11_27;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/11/28 11:34
 * @Description:
 */
import java.util.*;
public class Main_I {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <=i ; j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }
}
