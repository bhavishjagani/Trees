package Heaps;
public class Main {
    public static void main(String[] args) {
        Heap heap = new Heap();

        heap.insert(2);
        heap.insert(43);
        heap.insert(4);
        heap.insert(17);
        heap.insert(12);
        heap.insert(11);
        heap.insert(129);
        System.out.println(heap);
        System.out.println(heap.peek());
    }
}