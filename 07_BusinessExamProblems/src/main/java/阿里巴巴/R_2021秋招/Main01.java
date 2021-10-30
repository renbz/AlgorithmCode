package 阿里巴巴.R_2021秋招;

/**
 * @author Ren
 */

import java.util.*;

public class Main01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str = "long aaaa[10][10][10];";
        String[] s = str.split(" ");
        int res = 0;
        String[] t = s[1].split(",");
        for (int i = 0; i < t.length; i++) {
            if (t[i].contains("[")) {
                String[] split = t[i].split("\\[");
                int num1 = 1;
                for (int j = 0; j < split.length; j++) {
                    if (split[j].contains("]")) {
                        String y = null;
                        if(split[j].contains(";")){
                            y = split[j].substring(0, split[j].length() - 2);
                        }else {
                            y = split[j].substring(0, split[j].length() - 1);
                        }

                        int temp = Integer.parseInt(y);
                        num1 *= temp;
                    }
                }
                res += num1;
            } else {
                res += 1;
            }
        }

        if (s[0].equals("int")) {
            System.out.println(res * 4);
        } else if (s[0].equals("long")) {
            System.out.println(res * 8);
        } else if (s[0].equals("char")) {
            System.out.println(res);
        }

    }

}
