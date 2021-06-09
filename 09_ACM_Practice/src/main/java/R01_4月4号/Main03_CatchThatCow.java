package R01_4月4号;

/**
 * @author Ren
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main03_CatchThatCow {

    static int N,K;
    static int MAXINT=100000;
    static int[] visit=new int[MAXINT+10];//判重标记，当visit[x][y]=1时表示已经扩展过
    static class step{
        int x;//位置
        int steps;//到达所需的步数
        public step(int x,int steps) {
            this.steps=steps;
            this.x=x;
        }
        public int getX() {
            return x;
        }
        public int getSteps() {
            return steps;
        }

    }
    public static void main(String[] args) {

        Scanner reader=new Scanner(System.in);
        N=reader.nextInt();
        K=reader.nextInt();
        //add()和remove()方法在失败的时候会抛出异常(不推荐)
        Queue<step> queue = new LinkedList<step>();
        //添加元素
        step steps0=new step(N, 0);
        queue.offer(steps0);
        visit[N]=1;
        while(!queue.isEmpty()) {
            step s=queue.element();
            if(s.getX()==K) {
                System.out.println(s.getSteps());
                return ;
            }
            else {
                if(s.getX()-1>=0&&visit[s.getX()-1]!=1) {
                    step steps1=new step(s.getX()-1, s.getSteps()+1);
                    queue.offer(steps1);
                    visit[s.getX()-1]=1;
                }
                if(s.getX()+1<=MAXINT&&visit[s.getX()+1]!=1) {
                    step steps1=new step(s.getX()+1, s.getSteps()+1);
                    queue.offer(steps1);
                    visit[s.getX()+1]=1;
                }
                if(s.getX()*2<=MAXINT&&visit[s.getX()*2]!=1) {
                    step steps1=new step(s.getX()*2, s.getSteps()+1);
                    queue.offer(steps1);
                    visit[s.getX()*2]=1;
                }
                queue.poll();
            }
        }
    }
}

