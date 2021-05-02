package p15.lecture;

import java.util.LinkedList;
import java.util.Queue;

public class A06Queue {
	public static void main(String[] args) {
		Queue<Integer> quene = new LinkedList<>();
		
		quene.offer(9);
		quene.offer(6);
		quene.offer(3);
		
		int first = quene.poll();
		System.out.println(first);
		
		quene.offer(30);
		quene.offer(10);
		quene.offer(20);
		
		System.out.println(quene.peek());
	}
}
