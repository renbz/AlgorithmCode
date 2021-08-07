package 好未来.秋招2017_01;

/**
 * @author Ren
 */

import java.util.*;

public class R01_字符串中找出连续最长的数字串 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        if (str.length()==0) System.out.println();
        int count = 1, max = 1, index = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) - str.charAt(i - 1) == 1) {
                count++;
                if(count>max){
                    max=count;
                    index = i;
                }
            }else {
                count=1;
            }
        }
        System.out.println(str.substring(index-max+1,index+1));

    }

}
