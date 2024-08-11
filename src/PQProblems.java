import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
public class PQProblems {
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));

        for (ListNode node : lists) {
            if (node != null) {
                pq.offer(node);
            }
        }

        ListNode temp = new ListNode(0);
        ListNode current = temp;

        while (!pq.isEmpty()) {
            ListNode minNode = pq.poll();
            current.next = minNode;
            current = current.next;

            if (minNode.next != null) {
                pq.offer(minNode.next);
            }
        }
        return temp.next;
    }
    public static void printLists(ListNode result) {
        while (result != null) {
            if (result.next == null) {
                System.out.print(result.val);
            }
            else {
                System.out.print(result.val + ", ");
            }
            result = result.next;
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] frequency = new int[10000];

        for (int num : nums) {
            frequency[num]++;
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> frequency[a]));

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                minHeap.offer(i);
                if (minHeap.size() > k) {
                    minHeap.poll();
                }
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }

        return result;
    }
    public static void main (String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next  = new ListNode(4);
        l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(1);
        l2.next  = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode l3 = new ListNode(2);
        l3.next  = new ListNode(6);
        ListNode[] combinedList = {l1, l2, l3};
        ListNode result = mergeKLists(combinedList);

        int[] nums = {1, 2, 4, 5, 1, 5, 6, 1, 4};
        System.out.println(Arrays.toString(topKFrequent(nums, 2)));
    }
}