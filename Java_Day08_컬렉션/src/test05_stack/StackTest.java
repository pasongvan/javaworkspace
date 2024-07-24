package test05_stack;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// Stack
		// 단일클래스, 인터페이스 없음
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		stack.add(2);
		stack.push(3);
		
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		
		System.out.println(stack.peek()); // 값을 꺼내지 않고 조회만 함
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
