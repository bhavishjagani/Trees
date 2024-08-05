package HeapPriorityQueue;
import java.util.ArrayList;
public class MinHeap {
    private final ArrayList<Integer> heap;
    public MinHeap() {
        heap = new ArrayList<>();
    }
    public void insert (int value) {
        heap.add(value);
        if (heap.get(heap.size() - 1) != null) {
            heapifyMin(heap.size() - 1);
        }
        else {
            heap.remove(value);
        }
    }
    public void heapifyMin(int index) {
        int parentIndex = (index-1)/2;
        while (index > 0 && heap.get(index) < heap.get(parentIndex)) {
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = (index-1)/2;
        }
    }
    public void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }
    public int peek() {
        return heap.get(0);
    }
    @Override
    public String toString() {
        return heap.toString();
    }
}