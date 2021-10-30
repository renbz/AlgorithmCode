package 天梯赛练习题_L1;

/**
 * @author Ren
 */

import java.util.*;
public class Main003_统计个位数 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char [] c = str.toCharArray();

        Map<Character,Integer> map = new HashMap<Character,Integer>();
        // treeSet 保证存入的元素有序
        Set<Character> set = new TreeSet();

        for (int i = 0; i < c.length; i++) {
            if(map.get(c[i])==null){
                map.put(c[i],1);
            }else{
                map.put(c[i],map.get(c[i])+1);
            }
            set.add(c[i]);
        }

        for (Character key : set) {
            int value = map.get(key);
            System.out.println(key+":"+value);
        }
    }
}
