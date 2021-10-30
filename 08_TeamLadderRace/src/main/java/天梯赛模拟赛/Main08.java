package 天梯赛模拟赛;

/**
 * @author Ren
 */

import java.util.*;

public class Main08 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        Map map = new HashMap<Integer,Integer>();
        while (k-->0){
            String s = in.next();
            String [] arr  = s.split("-");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int r = in.nextInt();


            if(map.get(a)==null){
                map.put(a,r);
            }else{
                int m = (int)map.get(a);
                map.put(a,(m+r));
            }
        }

        Set<Integer> set = map.keySet();

        int cindex = -1;
        int ccore = -1;
        for (Integer o : set) {
            if((int)map.get(o) > ccore){
                cindex=o;
                ccore=(int)map.get(o);
            }
        }

        System.out.println(cindex+" "+ccore);

    }
}
