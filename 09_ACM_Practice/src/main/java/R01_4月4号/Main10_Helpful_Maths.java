package R01_4月4号;

/**
 * @author Ren
 */
import java.util.*;
public class Main10_Helpful_Maths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        ArrayList list = new ArrayList();
        String []s = str.split("\\+");

        for (int i = 0; i < s.length; i++) {
            list.add(Integer.parseInt(s[i]));
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("+");
        }
        System.out.println(sb.toString().substring(0,sb.length()-1));


    }

}
