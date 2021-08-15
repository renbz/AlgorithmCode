/**
 * @author Ren
 */

public class Test2 {
    public static void main(String[] args) {

        int a = 50, b = 34, c = 9;

        if (a < b) {
            if (b < c)
                System.out.println(c);
            else
                System.out.println(b);

        } else if (a < c)
            System.out.println(c);
        else
            System.out.println(a);
    }

}
