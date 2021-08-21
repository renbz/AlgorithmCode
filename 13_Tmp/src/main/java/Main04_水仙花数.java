/**
 * @author Ren
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main04_水仙花数 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int left = in.nextInt(), right = in.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = left; i <= right; i++) {
                if (i == (i % 100 / 10) * (i % 100 / 10) * (i % 100 / 10) + (i % 10) * (i % 10) * (i % 10) + (i / 100) * (i / 100) * (i / 100)) {
                    list.add(i);
                }
            }
            if(list.size()==0){
                System.out.println("no");
            }else{
                for (int i = 0; i < list.size(); i++) {
                    if(i==list.size()-1){
                        System.out.print(list.get(i)+"\n");
                    }else {
                        System.out.print(list.get(i)+" ");
                    }
                }
            }
        }

    }

}
