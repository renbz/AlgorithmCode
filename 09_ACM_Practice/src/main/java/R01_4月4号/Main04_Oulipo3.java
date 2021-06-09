package R01_4月4号;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main04_Oulipo3 {

    static int count=0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = Integer.parseInt(in.nextLine());
        while (k-- > 0) {
            String str1 = in.nextLine();  //目标串
            String str2 = in.nextLine();
            count=0;
            match(str1,str2);
            System.out.println(count);

        }
    }

    static void match(String p, String s) {
        long hash_p = hash(p); // p的hash值
        long[] hashOfS = hash(s, p.length());
        match(hash_p, hashOfS,p,s);
    }

    static void match(long hash_p, long[] hash_s,String p,String s) {
        for (int i = 0; i < hash_s.length; i++) {
            if (hash_s[i] == hash_p) {
                if (p.equals(s.substring(i, i + p.length())) )//此行代码为了避免hash冲突
                    count++;
            }
        }
    }

    /**
     * n 是子串（模式串）的长度
     * 用滚动方法求出s中长度为n的每个子串的hash，组成一个hash数组
     */
    static long seed = 31;

    static long hash(String str) {
        long hash = 0;
        for (int i = 0; i != str.length(); i++) {
            hash = seed * hash + str.charAt(i);
        }
        return hash % Long.MAX_VALUE;
    }

    static long[] hash(String s, int n) {
        long[] res = new long[s.length() - n + 1];
        //前m个字符的hash
        res[0] = hash(s.substring(0, n));
        for (int i = n; i < s.length(); i++) {
            char newChar = s.charAt(i);
            char ochar = s.charAt(i - n);
            //前n个字符的hash*seed-前n个字符的第一字符*seed的n次方
            long v = (res[i - n] * seed + newChar - (long) Math.pow(seed, n) * ochar) % Long.MAX_VALUE;
            if (v < 0) v += Long.MAX_VALUE;
            res[i - n + 1] = v;
        }
        return res;
    }
}
