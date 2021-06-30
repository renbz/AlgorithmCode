package ch05;

/**
 * @author Ren
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class R05_约瑟夫环3 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 40, num = 7, start = 2;
        System.out.println(ysf(total, num, start));

        System.out.println(ysf(3, 2, 2));

    }


    static int ysf(int total, int num, int start) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < total; i++) list.add(i + 1);
        int index = 1 - start;
        while (list.size() > 1) {
            index = (index + num - 1) % (list.size());
            System.out.print(list.remove(index) + "\t");
        }
        return list.get(0);
    }

}