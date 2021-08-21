/**
 * @author Ren
 */
import java.util.*;
public class Main03_求数列的和 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            double n = in.nextDouble();
            int k = in.nextInt();
            double sum = n;
            while (k-->1){
                n = Math.sqrt(n);
                sum += n;
            }
            System.out.printf("%.2f",sum);
        }

    }

}
