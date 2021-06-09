package JVM相关;

/**
 * @author Ren
 */

public class R01_String_Intern {
    public static void main(String[] args) {
        String s = new String("a");
        s.intern();

        String s2 = "a";
        System.out.println(s == s2);


        String s3 = new String("a") + new String("a");
        s3.intern();

        String s4 = "aa";
        System.out.println(s3 == s4);
    }

}
