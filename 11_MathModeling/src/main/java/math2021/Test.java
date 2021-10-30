package math2021;

import java.util.Scanner;

/**
 * @author Ren
 */
public class Test {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 100000; i++) {
            String s = in.nextLine();
            if(i>99995){
                System.out.println("---第"+i+"个数据为： "+s);
            }
        }
    }
}
