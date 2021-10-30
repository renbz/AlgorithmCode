package 美团; /**
 * @author Ren
 */

import java.util.Scanner;
import java.util.TreeSet;

public class Main02_小美写作文 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n = in.nextInt();
        while (n-- > 0) {
            int a = in.nextInt();
            if (a == 1) {
                String b = in.next();
                str = str + b;
            } else {
                int b = in.nextInt();

                int index = b - 1;
                int leftIndex = index - 1;
                int rightIndex = index + 1;
                int resLeft = -1, resRight = -1;
                while (leftIndex >= 0) {
                    if (str.charAt(leftIndex) == str.charAt(index)) {
                        resLeft = leftIndex;
                        break;
                    }
                    leftIndex--;
                }
                while (rightIndex < str.length() - 1) {
                    if (str.charAt(rightIndex) == str.charAt(index)) {
                        resRight = rightIndex;
                        break;
                    }
                    rightIndex++;
                }

                if (resLeft == -1 && resRight == -1) {
                    System.out.println(-1);
                } else if (resLeft == -1) {
                    System.out.println(Math.abs(resRight - index));
                } else if (resRight == -1) {
                    System.out.println(Math.abs(resLeft - index));
                } else {
                    System.out.println(Math.min(Math.abs(resRight - index), Math.abs(resLeft - index)));
                }
            }
        }
    }
}
