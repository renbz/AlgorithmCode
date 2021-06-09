package java_2014_A;

/**
 * @author Ren
 */

public class Main006_六角填数 {
    static int [] a = {2,4,5,6,7,9,10,11,12};
    public static void main(String[] args) {
        f(0);
    }

    private static void f(int k) {
        if(k==9){
            int t=8+a[0]+a[1]+a[2];

            if(t==1+a[0]+a[3]+a[5] && t==a[2]+a[4]+a[7]+3
                && t== 8+a[3]+a[6]+3 && t == 1+a[1]+a[4]+a[8]
                && t== a[5]+a[6]+a[7]+a[8] ){
                    System.out.println(a[3]);
            }
        }
        for(int i=k;i<9;i++){
            int temp = a[k]; a[k]=a[i];a[i]=temp;
            f(k+1);
            temp = a[k]; a[k]=a[i];a[i]=temp;
        }

    }

}
