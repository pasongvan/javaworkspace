package test03_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {

		// Queue
		// Queue 인터페이스
		// LinkedList 구현체
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
		// queue.offer(), queue.add()
		// 둘다 추가, 예외처리와 관련한 차이
		
		// 값을 하나씩 꺼내기
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
		
		// 큐가 비어있지 않다면 값을 꺼낸다.
		while(!queue.isEmpty()) { 
			System.out.println(queue.poll());
		}
		
		

	}

}
