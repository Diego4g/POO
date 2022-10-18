package collections;

import java.util.PriorityQueue;

public class PriorityQueueTest {
  
  public  PriorityQueueTest() {
    PriorityQueue<Double> queue = new PriorityQueue<>();

    queue.offer(3.2);
    queue.offer(9.8);
    queue.offer(5.4);

    System.out.println("Polling from queue: ");
    
    while(queue.size() > 0) {
      System.out.println(queue.peek());
      queue.poll();
    }
  }
}
