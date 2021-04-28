package things;

import java.util.Stack;

public class A05tack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(3);
		stack.push(5);
		stack.push(6);
		
		int last = stack.pop();
		System.out.println(last);
		last = stack.pop();
		System.out.println(last);
		last = stack.pop();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		last = stack.peek();
		System.out.println(last);
	}
}
