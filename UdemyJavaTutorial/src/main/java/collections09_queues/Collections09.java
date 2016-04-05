package collections09_queues;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Collections09: Queues
 * add(), remove(), element()
 * offer(), poll(), peek()
 * UnBounded/Bounded Queue (ie) LinkedList/ArrayBlockingQueue
 */

public class Collections09 {

	public static void main(String[] args) {
		// Queue is FIFO
		// (head) <- ooooooooooooooooooooooo  <- (tail)
		
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
		
		// Throws NoSuchElement exception --- no items in queue yet.
		// System.out.println("Head of queue is: " + q1.element());
		
		q1.add(10);
		q1.add(20);
		q1.add(30);
		
		System.out.println("Head of queue is: " + q1.element());
		
		try {
			q1.add(40);
		}
		catch (IllegalStateException e){
			System.out.println("Tried to add too many items to the queue...");
		}
		
		for (Integer value: q1){
			System.out.println("Queue value: " + value);
		}
		System.out.println();
		
		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());
		
		try{
			System.out.println("Removed from queue: " + q1.remove());
		}
		catch (NoSuchElementException e){
			System.out.println("Tried to remove too many items from queue...");
		}
		System.out.println();
		
		/////////////////////////////////////////////////
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		
		System.out.println("Queue2 peek() when queue is empty: " + q2.peek());
		
		q2.offer(10);
		q2.offer(20);
		
		System.out.println("Queue2 peek() when queue is filled: " + q2.peek());
		
		if(q2.offer(30) == false){
			System.out.println("offer() failed to add third item.");
		}
		
		for (Integer value: q2){
			System.out.println("Queue2 value: " + value);
		}
		System.out.println();
		
		System.out.println("Queue2 pull(): " + q2.poll());
		System.out.println("Queue2 pull(): " + q2.poll());
		System.out.println("Queue2 pull(): " + q2.poll());
		System.out.println();
		
		
		
	}
}
