package java_2018_B;

/**
 * @author Ren
 */

public class Main004_耐摔指数 {
    public static int count(int n) {
        int t = 500,counts=1,r=1000,l=0,curr=500;
        while (n!=t){
            if(n>curr){
                l=500;
                curr = (l+r)/2;
                counts++;
            }else if(n<curr){
                r=curr;
                curr=(r+l)/2;
                counts++;
            }
        }
        return counts;
    }

    public static void main(String[] args) {
        int c = 1;
        for (int i = 1; i < 1000; i++) {
            if (count(i) > c) {
                c = count(i);
            }
        }
        System.out.println(c);
    }

}
