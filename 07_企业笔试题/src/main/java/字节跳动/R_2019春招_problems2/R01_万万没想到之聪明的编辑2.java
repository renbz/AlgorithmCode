package 字节跳动.R_2019春招_problems2;


import java.util.Scanner;

public class R01_万万没想到之聪明的编辑2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        while (k-- > 0) {
            String str = in.next();
            System.out.println(str.replaceAll("(.){3,}","$1$1").replaceAll("(.)\\1(.)\\2","$1$1$2")
            );
        }
    }
}
