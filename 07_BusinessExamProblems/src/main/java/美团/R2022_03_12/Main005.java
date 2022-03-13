package 美团.R2022_03_12;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/12 17:19
 * @Description:
 */

import java.util.*;

public class Main005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int[n];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) arr1[i] = in.nextInt();
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            if(map.get(t)!=null){
                List<Integer> list = new ArrayList<>();
                list.add(arr1[t]);
                map.put(t,list);
            }else{
                List<Integer> list = map.get(t);
                list.add(arr1[t]);
                map.put(t,list);
            }
        }
        int h_ans=0,b_ans=0;
        for (int i = 0; i < n; i++) {
            // 白色
            if(arr1[i]==0){
                if(map.get(arr1[i])==null) b_ans++;
                List<Integer> list = map.get(arr1[i]);
                if(list.contains(1)) b_ans++;
            } else{
                if(map.get(arr1[i])==null) h_ans++;
                List<Integer> list = map.get(arr1[i]);
                if(!list.contains(1)) h_ans++;
            }
        }
        System.out.println(b_ans +" "+h_ans);
    }
}
