package java_2020_B;

/**
 * @author Ren
 */

/**
 * 2020 年 7 月 1 日是中国共产党成立 99 周年纪念日。
 * 中国共产党成立于 1921 年 7 月 23 日。
 * 请问从 1921 年 7 月 23 日中午 12 时到 2020 年 7 月 1 日中午 12 时一共包
 * 含多少分钟？
 */

public class Main002_纪念日 {
    public static boolean isYear(int year){
        return year%400==0 || (year%4==0 && year%100!=0);
    }
    public static void main(String[] args) {
        int counts = 0;
        for (int i = 1922; i <= 2020; i++) {
            if(isYear(i)){
                counts += 366;
            }else{
                counts += 365;
            }
        }
        long m = (counts-22)*24*60;
        System.out.println(m);
    }
}