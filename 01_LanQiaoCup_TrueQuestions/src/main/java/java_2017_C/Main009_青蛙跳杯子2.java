package java_2017_C;

/**
 * @author Ren
 */
import java.util.*;
public class Main009_青蛙跳杯子2 {
    static String s1,s2;
    static int n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        s1 = in.next();
        s2 = in.next();
        n = s1.length();
        bfs();
    }

    static Set<String> set = new HashSet<String>();
    private static void bfs() {
        Queue<Node> q = new LinkedList<Node>();
        q.add(new Node(s1,0));
        set.add(s1);
        while(!q.isEmpty()){
            Node u = q.poll();
            if(u.s.equals(s2)){
                System.out.println(u.t);
                break;
            }
            char [] ch = u.s.toCharArray();
            int index = u.s.indexOf('*');
            for (int i = -3; i <= 3; i++) {
                if(index+i>=0 && index+i<n && i!=0){
                    swap(ch,index,index+i);
                    String n_s = new String(ch);
                    if(!set.contains(n_s)){
                        set.add(n_s);
                        q.add(new Node(n_s,u.t+1));
                    }
                    swap(ch,index,index+i);
                }
            }
        }
    }

    private static void swap(char [] ch, int i, int j) {
        char t = ch[i]; ch[i] = ch[j] ; ch[j] = t;
    }

    static class Node{
        String s;
        int t;
        public Node(String s, int t) {
            this.s = s;
            this.t = t;
        }
    }
}
