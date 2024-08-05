package PriorityQueue;
import HeapPriorityQueue.PriorityQueue;
import java.util.Arrays;
//import java.util.PriorityQueue;
public class priorityQueue {
    public static void main (String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.offer(3);
        queue.offer(4);
        queue.offer(7);
        queue.offer(1);
        queue.offer(6);
        System.out.println(queue);
//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        queue.add(5);
//        queue.add(3);
//        queue.add(4);
//        queue.add(2);
//        queue.add(1);
//        queue.add(null);
//        System.out.println(Arrays.toString(queue.toArray()));
//        System.out.println(queue.peek());
//        System.out.println(Arrays.toString(queue.toArray()));
    }
}