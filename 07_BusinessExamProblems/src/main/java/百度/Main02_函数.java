package 百度;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main02_函数 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            String str = in.next();
            if (str.contains("0")) {
                StringBuilder newStr = new StringBuilder();
                for (int i = 0; i < str.length()-1; i++) {
                    if(str.charAt(i)!='0' && str.charAt(i+1)=='0'){
                        newStr.append((char) (str.charAt(i)-1));
                        for (i = i+1; i < str.length(); i++) {
                            newStr.append(3);
                        }
                    }
                    if(i<str.length()){
                        newStr.append((char) (str.charAt(i)));
                    }

                }
                if(newStr.toString().charAt(0)=='0'){
                    str = newStr.toString().substring(1,newStr.toString().length());
                }else{
                    str = newStr.toString().substring(0,newStr.toString().length());
                }
            }


            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= '4') System.out.print(3);
                else {
                    System.out.print((char) (str.charAt(i)));
                }
            }
            System.out.println();
        }
    }
}
