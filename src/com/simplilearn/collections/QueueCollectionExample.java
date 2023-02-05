package com.simplilearn.collections;

import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.SynchronousQueue;

public class QueueCollectionExample {

	public static void main(String[] args) {
		
		// FIFO - First In First Out
		Queue<String> stringQueue = new PriorityQueue<>();
		stringQueue.add("Ram");
		stringQueue.add("John");
		stringQueue.add("Alex");
		stringQueue.add("Warner");
		
		System.out.println("Before using remove: " + stringQueue);
		
		System.out.println("Head of the Queue using element: " + stringQueue.element());
		
		System.out.println("Head of the Queue using peek: " + stringQueue.peek());
		
		System.out.println("Remove elements using poll: " + stringQueue.poll());	
		
		System.out.println("After using poll: " + stringQueue);
		
		System.out.println("Remove elements using remove: " + stringQueue.remove());
		
		System.out.println("After using remove: " + stringQueue);
		
		Iterator queueItr = stringQueue.iterator();
		
		System.out.println("Queue Elements using Iterator:: ");	
		
		while(queueItr.hasNext()) {
			System.out.println(queueItr.next());
		}

	}

}
