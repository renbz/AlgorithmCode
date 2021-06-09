package 天梯赛国赛_2020;

/**
 * @author Ren
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int t3 = in.nextInt();
        int t4 = in.nextInt();



        int min = in.nextInt();
        int yuzhi = in.nextInt();

        int [] arr = {t1,t2,t3,t4};
        Arrays.sort(arr);

        int cha1 = arr[3]-arr[0];
        int cha2 = arr[3]-arr[1];

        if(t1==0 && t2==0 && t3==0 && t4==0){
            System.out.println("Warning: please check all the tires!");
        }
        if(cha1>yuzhi && cha2>yuzhi){
            System.out.println("Warning: please check all the tires!");
        }else if(cha1>yuzhi&&cha2<=yuzhi ||  arr[0]<min){
            if(arr[0]==t1){
                System.out.println("Warning: please check #1!");
            }else if(arr[0]==t2){
                System.out.println("Warning: please check #2!");

            }else if(arr[0]==t3){
                System.out.println("Warning: please check #3!");

            }else if(arr[0]==t4){
                System.out.println("Warning: please check #4!");

            }
        }else if(cha1<=yuzhi && arr[0]>=min){
            System.out.println("Normal");
        }
    }
}
