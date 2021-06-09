package java_2013_C;

/**
 * @author Ren
 */
import java.util.Scanner;

//记忆型递归
public class Main009_买不到的数目2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        System.out.println(m*n-m-n);
    }
}
