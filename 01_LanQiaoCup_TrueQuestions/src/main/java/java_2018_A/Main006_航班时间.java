package java_2018_A;

/**
 * @author Ren
 */
import java.util.*;
public class Main006_航班时间 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        while(T-->0){
            String str0 = in.nextLine();
            String str1 = in.nextLine();
            // str2[] 中有四个字符串分别是  4个对应的时间点 (+1)
            String [] str2 = {str0.substring(0,8),str0.substring(9),
                    str1.substring(0,8),str1.substring(9)};
            // 将这四个时间字符串，转换为4个整型数组，每个数组分别存放每个时间点的时分秒
            int [] time1 = String2time(str2[0]);
            int [] time2 = String2time(str2[1]);
            int [] time3 = String2time(str2[2]);
            int [] time4 = String2time(str2[3]);
            // 求得起始和降落时间的差
            int [] subtime1 = subTime(time1,time2);
            int [] subtime2 = subTime(time3,time4);
            // 两次起始降落 时间的差就是结果
            int [] result = avgTime(subtime1,subtime2);
            // 在为个位数的时间前补充零
            String [] ans = zeroAns(result);
            //打印输出结果
            System.out.println(ans[0]+":"+ans[1]+":"+ans[2]);
        }
    }
    //字符串转 时分秒
    static int [] String2time(String str){
        int h;
        if(str.endsWith("(+1)")){
            h = Integer.parseInt(str.substring(0,2))+24;
        }else if(str.endsWith("(+2)")){
            h = Integer.parseInt(str.substring(0,2))+48;
        }else{
            h = Integer.parseInt(str.substring(0,2));
        }
        int m = Integer.parseInt(str.substring(3,5));
        int s = Integer.parseInt(str.substring(6,8));
        return new int[]{h, m, s};
    }
    //计算两时间点的 时间差
    static int [] subTime(int[]time1,int[]time2){
        int m,s;
        if(time2[2]-time1[2]>=0){
            s = time2[2]-time1[2];
        }else{
            time2[1] = time2[1]-1;
            s = time2[2]+60-time1[2];
        }
        if(time2[1]-time1[1]>=0){
            m = time2[1]-time1[1];
        }else{
            time2[0] = time2[0]-1;
            m = time2[1]+60-time1[1];
        }
        int h = time2[0] - time1[0];
        return new int[]{h,m,s};
    }
    //求出两时间段的平均值
    static int [] avgTime(int [] st1,int[] st2){
        int h,m,s;
        if((st2[0]+st1[0])%2==0){
            h = (st2[0]+st1[0])/2;
        }else{
            h = (st2[0]+st1[0])/2;
            st2[1] += 60;
        }
        if((st2[1]+st1[1])%2==0){
            m = (st2[1]+st1[1])/2;
        }else{
            m = (st2[1]+st1[1])/2;
            st2[2] += 60;
        }
        s = (st2[2]+st1[2])/2;
        return new int []{h,m,s};
    }
    //将结果的个位数前面加上零
    static String [] zeroAns(int[] res){
        String h,m,s;
        if(res[0]<10){
            h = "0"+res[0];
        }else{
            h = ""+res[0];
        }
        if(res[1]<10){
            m = "0"+res[1];
        }else{
            m = ""+res[1];
        }
        if(res[2]<10){
            s = "0"+res[2];
        }else{
            s = ""+res[2];
        }
        return new String[]{h,m,s};
    }
}