package com.assembling;

import java.util.LinkedList;

public class Test4 {
    public static void main( String[]args){
        String input = "Java articles are Awesome";

        char res = findNonRep(input);
        System.out.println(res);

    }
    static  char findNonRep(String input){
        char str = input.chars()
                .mapToObj(c->(char)c)
                .filter(c->input.indexOf(c) !=
                        input.lastIndexOf(c))
                .findFirst()
                .orElse('\0');
        return str;

    }

    class ListNode{
        int val;
        ListNode next;
        ListNode prev;
        ListNode(int val){
            this.next=null;
            this.prev=null;
            this.val=val;
        }
    }


    // 1 2 3 4 5 6  n=2
    // o/p  2 1 4 3 6 5
    class DeleteNode{
        public ListNode deleteNode(ListNode head, int n){
//            ListNode temp = new ListNode(0);

            ListNode curr = head;
            ListNode newHead = null;
            ListNode prevGrp = null;
            while (curr!=null){
                ListNode grpstrt = curr;
                ListNode prev = null;
                int count = 0;
                while (curr!=null && count<n){
                    ListNode next = curr.next;
                    curr.next=prev;
                    curr.prev = next;

                    prev = curr;
                    curr = next;
                    count++;
                }
                if(newHead == null){
                    newHead = prev;
                }
                if(prevGrp!=null){
                    prevGrp.next=prev;
                    prev.prev=prevGrp;
                }
                prevGrp = grpstrt;
            }
            return newHead;




//            ListNode fast = temp;
//            ListNode slow = temp;
//
//
//
//
//
//            for(int i=0;i<n;i++){
//                fast = fast.next;
//            }
//            while (fast.next!=null){
//                fast = fast.next;
//                slow = slow.next;
//            }
//            slow.next = slow.next.next;
//            return temp;
        }
    }





}


