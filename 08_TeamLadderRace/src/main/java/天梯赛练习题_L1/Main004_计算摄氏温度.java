package 天梯赛练习题_L1;

/**
 * @author Ren
 */

import java.util.*;
public class Main004_计算摄氏温度 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
        int c = 5*(f-32)/9 ;
        System.out.println("Celsius = "+c);
    }
}
