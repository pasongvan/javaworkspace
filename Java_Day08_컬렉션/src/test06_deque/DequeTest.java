package test06_deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {

	public static void main(String[] args) {
		// Deque
		// 인터페이스: Deque
		// 구현체: ArrayDeque, LinkedList
		
		Deque<String> deque = new ArrayDeque<>();
		
		deque.addFirst("alice");
		deque.addFirst("luna");
		deque.addLast("max");
		deque.addFirst("daisy");
		
		System.out.println(deque);
		
		System.out.println(deque.removeLast());
		System.out.println(deque.removeFirst());
		System.out.println(deque.removeLast());
		System.out.println(deque.removeFirst());

	}

}
