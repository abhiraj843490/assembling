package com.abhi_prep.DSA;

public class LinkedList1 {
    public static void main(String []args){
        Solution list = new Solution();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.print("Linked List: ");
        list.display();
        list.deleteMid();
    }
}
class Node{
    int val;
    Node next;
    public Node(int val){
        this.val=val;
        this.next = null;
    }
}
class Solution{
    Node head;

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node curr = head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public Node deleteMid(){
        if(head==null || head.next==null){
            return null;
        }
        Node slow = head;
        Node fast = head.next.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
