package java_2017_C;

import java.util.*;

public class Main009_青蛙跳杯子 {

	private static StringBuilder start;
	private static StringBuilder target;
	/*1.  封装一个持有状态和层次的类*/
	static Set<String> allState = new HashSet<String>();
	public static class StateAndLevel{
		StringBuilder state;
		int level;
		int pos;  // * (空杯子) 的位置

		public StateAndLevel(StringBuilder state, int level , int pos) {
			this.state = state;
			this.level = level;
			this.pos = pos;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		start = new StringBuilder(in.next());
		target = new StringBuilder(in.next());
		//宽度优先搜索
		bfs();
	}
	private static void bfs() {
		/*2. 将初始状态加入队列*/
		Queue<StateAndLevel> q = new LinkedList<StateAndLevel>();
		q.add(new StateAndLevel(start,0,start.indexOf("*")));
		allState.add(start.toString());
		/*3. 不停弹出队首,一步演化成相邻状态，加入队列（判重）*/
		while(!q.isEmpty()){
			StateAndLevel front = q.poll();
			StringBuilder state = front.state;
			int level = front.level;
			if(state.toString().equals(target.toString())){
				System.out.println(level);
				break;
			}
			int pos = front.pos;
			// 和目标值作比对
			//可以演化出若干个相邻状态
			for (int i = -3; i < 3; i++) {
				if(i==0) continue;
				if(pos+i >= 0 && pos+i < state.length() ){

					StringBuilder new_state = new StringBuilder(state);


						swap(new_state, pos, pos + i); //交换 达新状态
						if(!allState.contains(new_state.toString())){ //判重
							q.add(new StateAndLevel(new_state,level+1,pos+i));//加入队列
							allState.add(new_state.toString());//放入set
						}

				}
			}

		}
		/*  */
	}

	private static void swap(StringBuilder a, int i, int j) {
		char t = a.charAt(i);
		a.setCharAt(i,a.charAt(j));
		a.setCharAt(j,t);
	}
}