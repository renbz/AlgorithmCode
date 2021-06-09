package java_2020_B;

/**
 * @author Ren
 */
import java.util.*;
public class Main006_分类计数 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int count1 = 0, count2 = 0,count3 = 0;
        for(int i=0;i<str.length();i++){
            if((int)str.charAt(i)>=(int)'A' && (int)str.charAt(i)<=(int)'Z'){
                count1++;
            }
            if((int)str.charAt(i)>=(int)'a' && (int)str.charAt(i)<=(int)'z'){
                count2++;
            }
            if((int)str.charAt(i)>=(int)'0' && (int)str.charAt(i)<=(int)'9'){
                count3++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
    }
}
