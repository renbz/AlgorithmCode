package java_2018_A;

/**
 * @author Ren
 */
public class Main004_方格计数 {
    public static void main(String[] args) {
        long counts = 0;
        long t = 2500000000L;
        for(long i= -50000;i<=50000;i++)
            for(long j= -50000;j<=50000;j++) {
                if (i != 0 && j != 0 && i * i + j * j <= t)  counts++;
            }
        System.out.println(counts);
    }
}
