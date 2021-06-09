package 天梯赛模拟赛;

/**
 * @author Ren
 */

import java.util.*;

public class Main08_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        Map map = new HashMap<String,Integer>();
        while (k-->0){
            String s = in.next();

            String st = s.substring(0,s.indexOf('-'));
            int r = in.nextInt();
            if(map.get(st)==null){
                map.put(st,r);
            }else{
                map.put(st,(int)map.get(st)+r);
            }
        }

        Set<String> set = map.keySet();

        String cindex = "";
        int ccore = -1;
        for (String o : set) {
            if((int)map.get(o) > ccore){
                cindex=o;
                ccore=(int)map.get(o);
            }
        }

        System.out.println(cindex+" "+ccore);

    }
}
