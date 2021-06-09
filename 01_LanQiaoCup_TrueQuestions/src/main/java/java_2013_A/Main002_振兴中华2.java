package java_2013_A;

/**
 * @author Ren
 */

public class Main002_振兴中华2 {
    public static void main(String[] args) {
        System.out.println(f(0,0));
    }
    private static int f(int i, int j) {
        if(i==3 || j==4) return 1;
        return f(i+1,j)+f(i,j+1);
    }
}
