package projectPackage;

import java.util.LinkedList;

public class QueueClass {

	private LinkedList<Object> queue;
	
	public QueueClass() {
		queue = new LinkedList<Object>();
		
	}
	
	public boolean empty() {
		return (queue.size() == 0);
	}
	
	public Object front() {
		if(empty())
			throw new NullPointerException("Queue is empty");
		else
			return queue.getFirst();
	}
	
	public Object dequeue() {
		if(empty())
			throw new NullPointerException("Queue is empty");
		else
			return queue.removeFirst();
	}
	
	public void enqueue(Object element) {
		queue.addLast(element);
	}
	
}
