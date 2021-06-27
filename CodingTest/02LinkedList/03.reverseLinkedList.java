package com.company;
import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x)
    {
        this.val = x;
    }
}

public class Main {
    //LikedList
    // reverse LinkedLists
    //  singly linked list vs doubly linked list
    public static void main(String[] args) {
        ListNode l1 = new  ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        printNode(l1);
        ListNode l2 = reverseList(l1);
        printNode(l2);
    }
    public static ListNode reverseList(ListNode cur)
    {
        //1. ds
        ListNode next = null;
        ListNode prev = null;

        //2. for while
        while(cur !=null)
        {
            next = cur.next; //cur다음 step
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    public static void printNode(ListNode l1){
        while(l1 !=null){
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }


}
