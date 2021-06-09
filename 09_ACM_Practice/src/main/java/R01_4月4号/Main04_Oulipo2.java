package R01_4月4号;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main04_Oulipo2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = Integer.parseInt(in.nextLine());
        while (k-- > 0) {
            String str1 = in.nextLine();  //目标串
            String str2 = in.nextLine();
            int count = 0;
            int index = 0;


            while (true) {
                int tmp = indexOf(str2, str1, index);
                if (tmp != -1) {
                    count++;
                    index=tmp+1;
                    indexOf(str2, str1, tmp+1);
                }else{
                    break;
                }
            }
            System.out.println(count);
        }
    }

    //如果匹配成功返回 源字符串中对应模式串的第一个字符索引
    static int indexOf(String s, String p, int index) {
        int i = index;
        int sc = i;
        int j = 0;
        while (sc < s.length()) {
            if (s.charAt(sc) == p.charAt(j)) {
                sc++;
                j++;
                if (j == p.length())
                    return i;
            } else {
                i++;
                sc = i; //扫描指针以i为起点
                j = 0;  // j 恢复为0
            }
        }
        return -1;
    }
}
