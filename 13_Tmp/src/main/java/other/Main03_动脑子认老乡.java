package other; /**
 * @author Ren
 */

import java.util.*;
public class Main03_动脑子认老乡 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int m = in.nextInt();
            Set<Integer> set = new HashSet<>();
            set.add(1);
            int[][] arr = new int[m][3];
            for (int i = 0; i < m; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();
                int max = a > b ? a : b;
                int min = a < b ? a : b;
                arr[i][0] = min;
                arr[i][1] = max;
                arr[i][2] = c;
            }
            Arrays.sort(arr, (o1, o2) -> o1[0] - o2[0] == 0 ? o1[1] - o2[1] : o1[0] - o2[0]);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][2] == 1 && (set.contains(arr[i][0]) || set.contains(arr[i][1]))) {
                    set.add(arr[i][0]);
                    set.add(arr[i][1]);
                }
            }
            System.out.println(set.size() - 1);
        }
    }
}
