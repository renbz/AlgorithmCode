package 字节跳动.R_2019春招_problems2;

/**
 * @author Ren
 */

import java.util.*;
public class R02_万万没想到之抓捕孔连顺2 {

    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int D=sc.nextInt();
        int []s=new int[N];
        long num=0;
        for(int i=0;i<N;i++){
            s[i]=sc.nextInt();
        }


        for(int i=0,j=i+2;i<N-2;i++){
            long p;
            while(j<N&&(s[j]-s[i]<=D)) {
                j++;
            }
            p=j-i-1;
            num=num+(p*(p-1)/2);
        }
        System.out.println(num%99997867);
    }
}