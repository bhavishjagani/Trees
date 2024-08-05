package HeapPriorityQueue;
public class PriorityQueue {
    private MinHeap heap;
    public PriorityQueue() {
        heap = new MinHeap();
    }
    public int peek() {
        return heap.peek();
    }
    public void offer(int value) {
        heap.insert(value);
    }
    @Override
    public String toString() {
        return heap.toString();
    }
}