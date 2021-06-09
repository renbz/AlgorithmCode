package java_2017_A;
import java.util.Scanner;
public class Main010_油漆面积4 {
  static int n, sum = 0;
  static boolean[][] p = new boolean[10005][10005];
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    for (int i = 0; i < n; i++) {
      int x1 = in.nextInt();
      int y1 = in.nextInt();
      int x2 = in.nextInt();
      int y2 = in.nextInt();
      paint(x1, y1, x2, y2);
    }
    for (int i = 0; i < p.length; i++) 
      for (int j = 0; j < p[i].length; j++) 
        if (p[i][j])   sum += 1;
    System.out.println(sum);
  }
  private static void paint(int x1, int y1, int x2, int y2) {
    for (int i = x1; i < x2; i++)
      for (int j = y1; j < y2; j++)
        p[i][j] = true;
  }
}
