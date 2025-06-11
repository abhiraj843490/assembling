package com.abhi_prep.DSA;

public class LinkedListPoc {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        ListNode head = createList(input);

        System.out.print("Original List: ");
        printList(head);

        Solution sol = new Solution();
        ListNode swapped = sol.swapPairs(head);

        System.out.print("Swapped Pairs: ");
        printList(swapped);
    }
    public static class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null)
                return head;

            ListNode node = head.next;
            System.out.println("node :"+head.next.val);
            head.next = swapPairs(head.next.next);
            node.next = head;
            return node;
        }
    }

    // Utility method to create a linked list from an array
    public static ListNode createList(int[] values) {
        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    // Utility method to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }
}

