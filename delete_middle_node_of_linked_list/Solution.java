package delete_middle_node_of_linked_list;

// You are given the head of a linked list.
// Delete the middle node, and return the head of the modified linked list.
// The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing
// For a linked list with an even number of nodes, delete node n/2 + 1

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null)
            return null;

        int length = 0;
        ListNode node = head;

        while(node != null) {
            length++;
            node = node.next;
        }

        if(length == 1)
            return null;

        ListNode prev = head;
        node = head;
        int mid = length / 2;
        int i = 0;

        while(i < mid) {
            prev = node;
            node = node.next;
            i++;
        }

        prev.next = node.next;

        return head;
    }
}
