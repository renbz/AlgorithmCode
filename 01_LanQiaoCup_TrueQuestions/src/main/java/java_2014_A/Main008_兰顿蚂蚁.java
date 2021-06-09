package java_2014_A;
import java.util.*;
/**
 * @author Ren
 */
public class Main008_兰顿蚂蚁 {
    static Scanner in = new Scanner(System.in);
    static int m = in.nextInt();
    static int n = in.nextInt();
    //创建格子地图的大小，m行n列
    static boolean [][] a = new boolean[m][n];
    public static void main(String[] args) {
        // 根据输入的数据，创建地图内容，true代表黑格，false代表白格
        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[1].length; j++) {
                if(in.nextInt()==1) {
                    a[i][j]=true;
                }
            }
        }
        // 记录蚂蚁的当前位置（在数组中的索引，所以要-1）
        int x = in.nextInt();
        int y = in.nextInt();
        // 记录蚂蚁的朝向
        String s = in.next();
        // 记录蚂蚁走的步数
        int t = in.nextInt();
        //调用方法
        f(s,t ,x,y);
    }
    private static void f(String s, int t, int x, int y) {
        if(t==0){
            System.out.println(x+" "+y);
            return;
        }
        if(s.equals("U") || s=="U"){
            if(a[x][y]==true){
                // 蚂蚁头朝上，当前格子为黑格。 需要右转90度 前进一步，当前格子变为白格
                s = "R";           // 改变蚂蚁的方向
                a[x][y] = false;   // 改变格子的颜色
                y++;               // 更新蚂蚁位置所在的坐标
            }else{
                // 蚂蚁头朝上，当前格子为白色。 需要左转90度，前进一步， 当前格子变为黑色
                s = "L";
                a[x][y] = true;
                y--;
            }
            f(s,t-1,x,y);   // 进行下一步的走势判断
        }else if(s.equals("R") || s=="R"){
            if(a[x][y]==true){
                s = "D"; a[x][y]=false; x++;
            }else{
                s = "U"; a[x][y]=true; x--;
            }
            f(s,t-1,x,y);
        }else if(s.equals("D") || s=="D"){
            if(a[x][y]==true){
                s = "L"; a[x][y]=false; y--;
            }else{
                s = "R"; a[x][y]=true; y++;
            }
            f(s,t-1,x,y);
        }else if(s.equals("L") || s=="L"){
            if(a[x][y]==true){
                s = "U"; a[x][y]=false; x--;
            }else{
                s = "D"; a[x][y]=true; x++;
            }
            f(s,t-1,x,y);
        }
    }
}
