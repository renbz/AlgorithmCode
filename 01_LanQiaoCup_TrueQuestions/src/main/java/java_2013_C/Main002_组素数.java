package java_2013_C;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ren
 */

public class Main002_组素数 {
    public static void main(String[] args) {
        int [] a =  {1,9,4,9};
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<4;i++){
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    for (int l = 0; l < 4; l++) {
                        if(a[i]+a[j]+a[k]+a[l]==23 && isPrime(1000*a[i]+100*a[j]+10*a[k]+a[l]))
                            set.add(1000*a[i]+100*a[j]+10*a[k]+a[l]);
                    }
                }
            }
        }
        for (Integer integer : set) {
            System.out.println(integer);
        }
        System.out.println("答案:"+set.size());
    }
    // 判断是否为素数
    static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }

}
