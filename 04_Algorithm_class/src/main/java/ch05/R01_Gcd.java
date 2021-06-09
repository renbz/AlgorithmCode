package ch05;

/**
 * @author Ren
 */

public class R01_Gcd {

    public static void main(String[] args) {
        System.out.println(gcd2(260, 20000));
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









    /*static int gcd1(int a,int b){
        if(a==b)
            return a;
        return gcd1(a>b ? a-b : b-a , a<b ? a : b);
    }
    //GetCommonDivisor
    static int gcd3(int a,int b){
        if(a==b)
            return a;
        if((a&1)==0 && (b&1)==0){
            return gcd3(a>>1 , b>>1)<<1 ;
        }else if((a&1)==0 && (b&1)!=0){
            return gcd3(a>>1,b);
        }else if((a&1)!=0 && (b&1)==0){
            return gcd3(a,b>>1);
        }else{
            return gcd3(a>b ? a-b : b-a , a<b ? a : b);
        }
    }*/

