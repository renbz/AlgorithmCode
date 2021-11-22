package alphaacm011;

/**
 * @author Ren
 */

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int j=0;
        long beg2 = System.currentTimeMillis();
        while (j++<10000000){
            int year = (int)(3000*Math.random());
            int month = (int)(12*Math.random())+1;
            getTheMonthDays(year,month);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("大二 1000W条测试 耗时 "+(end2-beg2) +" ms");

        int i=0;
        long beg1 = System.currentTimeMillis();
        while (i++<10000000){
            int year = (int)(3000*Math.random());
            int month = (int)(12*Math.random())+1;
            getAns(year, month);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("大一 1000W条测试 耗时 "+(end1-beg1) +" ms");



    }
    public static int getAns(int year,int month){
        switch(month){
            case 2:
                if ((year%100==0&&year%400!=0)||year%4!=0)
                    return 28;
                else
                    return 29;
            case 4:
                return 30;
            case 6:
                return 30;
            case 9:
                return 30;
            case 11:
                return 30;
            default:
                return 31;
        }
    }
    public static int getTheMonthDays(int year, int month) {
        if ((year%4==0&&year%100!=0)||year%400==0){
            switch (month){
                case 1:
                    return 31;
                case 2:
                    return 29;
                case 3:
                    return 31;
                case 4:
                    return 30;
                case 5:
                    return 31;
                case 6:
                    return 30;
                case 7:
                    return 31;
                case 8:
                    return 31;
                case 9:
                    return 30;
                case 10:
                    return 31;
                case 11:
                    return 30;
                case 12:
                    return 31;
            }
        }else {
            switch (month){
                case 1:
                    return 31;
                case 2:
                    return 28;
                case 3:
                    return 31;
                case 4:
                    return 30;
                case 5:
                    return 31;
                case 6:
                    return 30;
                case 7:
                    return 31;
                case 8:
                    return 31;
                case 9:
                    return 30;
                case 10:
                    return 31;
                case 11:
                    return 30;
                case 12:
                    return 31;
            }
        }
        return 0;

    }
}