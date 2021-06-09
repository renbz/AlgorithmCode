package java_2017_C;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class Main008_拉马车 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b = in.nextLine();
		int len = a.length()+b.length();
		Queue<Character> queue1 = new LinkedList<Character>();
		Queue<Character> queue2 = new LinkedList<Character>();
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<a.length();i++) 
			queue1.offer(a.charAt(i));
		for(int i=0;i<b.length();i++) 
			queue2.offer(b.charAt(i));
		Boolean Awin = true; // 初始和A赢牌时A先出牌
		int count = 0 ;  // 计数双方一共出牌多少次，当count过大时返回 -1
		while(!queue1.isEmpty() && !queue2.isEmpty()) {
			count++;
			if(count==10000)  break; // 当达到10000次，说明存在死循环，即跳出循环，返回-1
			if(Awin==true) {
				if(stack.contains(queue1.peek())) {
					Awin = true;
					char t = queue1.poll();
					queue1.offer(t);
					while(stack.peek()!=t) {
						queue1.offer(stack.pop());
					}
					queue1.offer(stack.pop());
				}else {
					stack.push(queue1.poll());
					Awin = false;
				}
				
			}else {
				if(stack.contains(queue2.peek())) {
					Awin = false;   // stack中存在元素和B出牌的元素相同时，则B收牌，下次B先出牌
					char t = queue2.poll();
					queue2.offer(t);
					while(stack.peek()!=t) {
						queue2.offer(stack.pop());
					}
					queue2.offer(stack.pop());
				}else {
					stack.push(queue2.poll());
					Awin = true;
				}
			}
		}
		StringBuffer sb = new StringBuffer();
		if(queue2.isEmpty()) {
			int size = queue1.size();
			for(int i=0;i<size;i++)
				sb.append(queue1.poll());
		    System.out.println(sb.toString());
		}else if(queue1.isEmpty()) {
			int size = queue2.size();
			for(int i=0;i<size;i++)
				sb.append(queue2.poll());
			System.out.println(sb.toString());
		}else if(count==10000)
			System.out.println(-1);
	}
}