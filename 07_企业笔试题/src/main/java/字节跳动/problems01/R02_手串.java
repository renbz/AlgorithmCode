package 字节跳动.problems01;

/**
 * @author Ren
 */
import java.util.*;
public class R02_手串 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c = in.nextInt();
        Map<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
        ArrayList<Integer> list ;
        int t =-1;
        while(n-->0){
            t++;
            int k = in.nextInt();  //颜色种类
            while(k-->0){
                int tmp=in.nextInt();
                
                if(map.get(tmp)==null){
                    list = new ArrayList<Integer>();
                }else{
                    list = map.get(tmp);
                }
                list.add(t);
                map.put(tmp, list);
            }
        }

        int ans = 0;
        for (ArrayList<Integer> list1 : map.values()) {
            for (int j = 0; j < list1.size()-1; j++) {
                if(list1.get(j)+m-1 >= list1.get(j+1) ){
                    ans++;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
