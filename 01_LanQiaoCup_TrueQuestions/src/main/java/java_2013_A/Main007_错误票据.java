package java_2013_A;

/**
 * @author Ren
 */
import java.util.*;
public class Main007_错误票据 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int M = 0, N = 0, max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<Integer>();
        boolean [] b = new boolean[100000];
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            String [] m = s.split(" ");
            for (int j = 0; j < m.length; j++) {
                int t = Integer.parseInt(m[j]); // 将分割的字符串转换为int
                b[t]=true;                      // 根据boolean记录出现的数字
                int l1 = set.size();            // 记录添加数据之前的set集合大小
                set.add(t);
                if(set.size()==l1)  N=t;        // 如果添加数据后 set集合的大小没有发生变化，说明遇到重复元素
                if(min>t) min = t;
                if(max<t) max = t;
            }
        }
        for(int i=min;i<=max;i++){
            if(b[i]==false) M=i;
        }
        System.out.println(M+" "+N);
    }
}
