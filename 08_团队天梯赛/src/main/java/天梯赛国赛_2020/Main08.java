package 天梯赛国赛_2020;

/**
 * @author Ren
 */

import java.util.*;

public class Main08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];
        Map<Integer,Integer> map = new HashMap<Integer, Integer>(9);
        Map<Integer,Integer> map2 = new HashMap<Integer, Integer>(32);
        Set<Integer> set = new HashSet<Integer>();
        map2.put(6,10000);  map2.put(7,	36);    map2.put(8,720);   map2.put(9,360);
        map2.put(10,80);    map2.put(11,252);   map2.put(12,108);  map2.put(13,72);
        map2.put(14,54);    map2.put(15,180);   map2.put(16,72);   map2.put(17,180);
        map2.put(18,119);   map2.put(19,36);    map2.put(20,306);  map2.put(21,1080);
        map2.put(22,144);   map2.put(23,1800);  map2.put(24,3600);
        int indexRow = -1,indexLie = -1;  //标记已知数的下标
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = in.nextInt();
                map.put(arr[i][j],arr[i][j]);
                if(arr[i][j]==0){
                    indexRow=i;
                    indexLie=j;
                }
            }
        }

        //确定i,j位置的值
        for (int i = 1; i < 10; i++) {
            if(map.get(i)==null){
                arr[indexRow][indexLie] = i;
            }
        }

        int i1 = in.nextInt()-1;
        int j1 = in.nextInt()-1;
        int i2 = in.nextInt()-1;
        int j2 = in.nextInt()-1;
        int i3 = in.nextInt()-1;
        int j3 = in.nextInt()-1;

        int type = in.nextInt();

        int res = 0;
        // 选择的是同一行,i要相等

        System.out.println(arr[i1][j1]);
        System.out.println(arr[i2][j2]);
        System.out.println(arr[i3][j3]);

        if(type<4){
            res = map2.get(arr[type-1][0]+arr[type-1][1]+arr[type-1][2]);
            System.out.println(res);
        }else if(type < 7){
            res = map2.get(arr[0][type-4]+arr[1][type-4]+arr[2][type-4]);
            System.out.println(res);
        }else if(type==7){
            res = map2.get(arr[0][0]+arr[1][1]+arr[2][2]);
            System.out.println(res);
        }else if(type==8){
            res = map2.get(arr[0][2]+arr[1][1]+arr[2][0]);
            System.out.println(res);
        }
    }
}
