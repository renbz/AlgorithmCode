package java_2013_A;

/**
 * @author Ren
 */

public class Main002_振兴中华 {
    static String s = "从我做起振兴中华";
    static char[][] map = {{'从','我','做','起','振'},
                           {'我','做','起','振','兴'},
                           {'做','起','振','兴','中'},
                           {'起','振','兴','中','华'},};
    static int ans = 0;
    public static void main(String[] args) {

        f(0,0);
        System.out.println(ans);
    }

    private static void f(int i, int j) {
        if(map[i][j]=='华') ans++;
        if(i+1<4 ){
            if(map[i+1][j]==s.charAt(i+j+1)){
                f(i+1,j);
            }
        }
        if(j+1<5){
            if(map[i][j+1]==s.charAt(i+j+1)){
                f(i,j+1);
            }
        }
    }
}
