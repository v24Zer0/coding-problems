package merge_k_sorted_lists;

// You are given an array of k linked-lists lists,
// each linked-list is sorted in ascending order.

// Merge all the linked-lists into one sorted linked-list and return it.

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<Integer> minheap = new PriorityQueue<>();

        for(ListNode node : lists) {
            while(node != null) {
                minheap.add(node.val);
                node = node.next;
            }
        }

        ListNode head = new ListNode();
        ListNode node = head;
        while(!minheap.isEmpty()) {
            node.next = new ListNode(minheap.poll());
            node = node.next;
        }

        return head.next;
    }
}
