package java_2018_A;

/**
 * @author Ren
 */
public class Main001_分数 {
    public static void main(String[] args) {
        long fz = 1; //分子
        long fm = 1; //分母
        for(int i=1;i<=19;i++){
            fm *= 2;
            fz +=fm;
        }
        System.out.println(fz+"/"+fm);
    }

}
