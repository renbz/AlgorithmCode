package java_2013_B;

/**
 * @author Ren
 */

public class test {
    public static void main(String[] args) {
        int [] a = new int[5];
        int k =1;
        a[k++] = 100;
        a[k]=200;
        for (int i : a) {
            System.out.println(i);
        }
    }
}
