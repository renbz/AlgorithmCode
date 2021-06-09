package R01_4月4号;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main09_Word_Capitalization {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s0 = s.substring(0,1);
        String s2 = s0.toUpperCase();
        String s1 = s.substring(1);
        System.out.println(s2+s1);
    }

}
