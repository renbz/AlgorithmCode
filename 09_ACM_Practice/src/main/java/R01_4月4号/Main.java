package R01_4月4号;

/**
 * @author Ren
 */

import java.util.*;
public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = Integer.parseInt(in.nextLine());
        while(k-->0){
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            int count = 0;
            while (str2.contains(str1)){
                count++;
                int index = str2.indexOf(str1);
                if(index+1 <= str2.length()) {
                    str2 = str2.substring(index + 1);
                }
            }
            System.out.println(count);
        }
    }
}