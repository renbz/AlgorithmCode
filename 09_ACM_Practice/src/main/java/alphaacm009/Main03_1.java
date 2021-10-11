package alphaacm009;

/**
 * @author Ren
 */

public class Main03_1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                if (i > 4 && j > 1) {
                    System.out.print(j + "*" + i + "=" + (i * j) + " ");
                } else {
                    System.out.print(j + "*" + i + "=" + " " + (i * j) + " ");
                }
                if (i == j) {
                    System.out.print("\n");
                }
            }
        }
    }
    public static void main2(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                if (i > 4 && j > 1) {
                    System.out.print(j + "*" + i + "=" + (i * j) + " ");
                } else {
                    System.out.print(j + "*" + i + "= " + (i * j) + " ");
                }
            }
            System.out.println();
        }
    }
}
