package 天梯赛校赛;

/**
 * @author Ren
 */
import java.util.*;
public class Main07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long k = in.nextLong();

        long m = n - n/(2*k);

        if(m/2==0){
            System.out.println("A");
        }else{
            System.out.println("B");
        }




    }
}
