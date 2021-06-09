package AlphaACM.test002;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main09 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        while (k-- >0){
            int n = in.nextInt();
            if(n==1){
                System.out.println("No");
            }else{
                boolean flag = true;
                for (int i = 2; i < n; i++) {
                    if(n%i==0){
                        flag = false;  //有一个被整除说明不是素数  立即跳出循环
                        break;
                    }
                }
                System.out.println(flag?"Yes":"No");
            }
        }
    }
}

