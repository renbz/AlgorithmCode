package ch05;

/**
 * @author Ren
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class R05_约瑟夫环3 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int total = 40;
        int num = 7;
        int start = 2;
        System.out.println(ysf(total, num,start));
    }


    static int ysf(int total, int num,int start) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < total; i++) {
            list.add(i+1);
        }
        int index = start-1;
        while (list.size()>1){
            index=(index+num-1)%(list.size());
            list.remove(index);
        }
        return list.get(0);
    }


}