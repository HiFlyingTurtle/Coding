package com.offer.oj;
/**
 * 剑指offer合并两个单链表
 * @author wwh
 * @create 2017/5/17
 */
public class MergeList {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode target=null;

        //取两个节点中较小的节点作为头结点
        if(list1.val>list1.val){
            target=list2;
            list2=list2.next;
        }else {
            target=list1;
            list1=list1.next;
        }

        ListNode mergeHead=target;
        while (list1!=null&&list2!=null){
            if(list1.val>list2.val){
             target.next=list2;
                list2=list2.next;
            }else {
                target.next=list1;
                list1=list1.next;
            }
            target=target.next;
            target.next=null;
        }

        if(list1==null){
            target.next=list2;
        }else{
            target.next=list1;
        }
        return mergeHead;

    }
    public static void main(String[] args) {

    }

}
