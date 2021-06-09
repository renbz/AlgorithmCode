package ch03;

import java.util.Arrays;

/**
 * @author Ren
 */

public class R05_PointMin {


    static int index1 = 0;
    static int index2 = 0;
    public static void main(String[] args) {

        //获取随机生成的点
        int [][] arr = arr();

        double min = ClosestPoint(arr);
        System.out.println("距离最短的两个点为: "+arr[index1][0]+","+arr[index1][1]+"   "+arr[index2][0]+","+arr[index2][1]);
        System.out.println("距离最近的两个点的距离为: "+min);
        System.out.println("两个点在数组中的下标为： " + index1 +" "+index2);

    }

    /**
     * 计算两点距离
     * @param p
     * @return
     */
    static double ClosestPoint (int [][] p){
        int n = p.length;

        Double min = Double.MAX_VALUE;
        double dis = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j <n ; j++) {
                dis = (p[j][0]-p[i][0])*(p[j][0]-p[i][0])+(p[j][1]-p[i][1])*(p[j][1]-p[i][1]);
                dis = Math.sqrt(dis);
                if(dis<min){
                    min = dis;
                    index1 = i;
                    index2 = j;
                }
            }
        }
        return min;
    }


    /**
     * 生成随机数组
     */
    static int[][] arr(){
        int [][] arr= new int[10][2];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j]=(int)(Math.random()*20);
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        return arr;
    }

}
