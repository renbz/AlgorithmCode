package R03_5月3号;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int aa=0,vv=0,ii=0,nn=0;
            int n = in.nextInt();
            char [] a = in.next().toCharArray();
            for(int i=0;i<a.length;i++){
                if(a[i]=='a') aa++;
                if(a[i]=='v') vv++;
                if(a[i]=='i') ii++;
                if(a[i]=='n') nn++;
            }

            int ans1=aa*vv*ii*nn;
            int ans2=n*n*n*n;

            if(ans1==0){
                System.out.println("0/1\n");
            }else{
                int k=gcd2(ans1,ans2);
                ans1=ans1/k;
                ans2=ans2/k;
                System.out.println(ans1+"/"+ans2);
            }
        }




    }
    public static int gcd2(int a, int b) {
        if (a == b) return a;
        if ((a & 1) == 0 && (b & 1) == 0) {
            return gcd2(a >> 1, b >> 1) << 1;
        } else {
            return gcd2(a > b ? a - b : b - a, a > b ? b : a);
        }
    }
}
