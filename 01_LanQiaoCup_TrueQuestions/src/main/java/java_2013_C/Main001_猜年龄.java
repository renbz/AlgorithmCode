package java_2013_C;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ren
 */
public class Main001_猜年龄 {
    public static void main(String[] args) {
        for(int i=1;i<100;i++){
            int k = i*i*i;
            if(k>1000 && k < 9999 && k*i > 100000 && k*i < 999999){
                String s = k+""+(k*i);
                if(is(s) )
                    System.out.println(i);
            }
        }
    }
    //判重
    static boolean is(String s){
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        if(set.size()==10) return true;
        return false;
    }
}