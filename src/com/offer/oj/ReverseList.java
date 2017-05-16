package com.offer.oj;

/**
 * 剑指offer反转链表
 * @author wwh
 * @create 2017/5/16
 */
public class ReverseList {
    /**
     * 头插法进行链表的反转
     * @param head
     * @return
     */
    public ListNode ReverseList(ListNode head) {
        if(head==null||head.next==null) return  head;
        ListNode pre=null;
        ListNode nex=null;
        while(head!=null){
            nex=head.next;
            head.next=pre;
            pre=head;
            head=nex;
        }
        return pre;

    }
}
