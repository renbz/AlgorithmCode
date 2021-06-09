package java_2018_B;

/**
 * @author Ren
 */

public class Main002_方格计数 {
    public static void main(String[] args) {
        long counts = 0;
        long t = 1000000L;
        for(long i= -1000;i<=1000;i++)
            for(long j= -1000;j<=1000;j++) {
                if (i != 0 && j != 0 && i * i + j * j <= t)  counts++;
            }
        System.out.println(counts);
    }
}
