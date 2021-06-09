package test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Ren
 */

public class Test04 {


    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = arr1.clone();
        int[] arr3 = new int[8];
        System.arraycopy(arr1, 0, arr3, 0, 8);

        int[] arr4 = Arrays.copyOf(arr1, arr1.length);


        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));


        int k = 5;

        if(++k == 6  && k == 6){
            System.out.println(k);
        }


    }
}
