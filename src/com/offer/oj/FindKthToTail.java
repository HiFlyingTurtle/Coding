package com.offer.oj;
/**
 * 剑指offer输出链表的倒数第k个节点
 * @author wwh
 * @create 2017/5/16
 */
public class FindKthToTail {

    /**
     * 反转单链表，逆序非递归实现 头插法
     * @param head
     * @return
     */
    public  static ListNode reverseList(ListNode head){
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

     /**
     * 先将链表逆序，然后输出顺手第k个再逆序回去
     * @param head
     * @param k
     * @return
     */
    public static ListNode FindKthToTail1(ListNode head,int k){
        if(k<=0)return null;
        ListNode target=reverseList(head);
        ListNode temp=target;
        for(int i=1;i<k;i++){
            if(target!=null){
                target=target.next;
            }else{
                return null;
            }
        }
        head=reverseList(temp);
        return target;
    }
    /**
     * 使用两个指针相差K个位置，让后一个指针移动到tail的时候，
     * 前面的指针指向第K个节点
     * @param head
     * @param k
     * @return
     */
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null) return head;
        ListNode target=head;
        ListNode nextK=head;
        for(int i=0;i<k;i++){
            //判断链表的长度是否会大于K
            if(nextK!=null){
                nextK=nextK.next;
            }else{
                return null;
            }

        }
        while (nextK!=null){
            target=target.next;
            nextK=nextK.next;
        }
       return target;

    }

    public static void Print(ListNode h){
        while(h!=null){
            System.out.print(h.val + " ");
            h=h.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(4);
        ListNode l5=new ListNode(5);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        ListNode head=l1;
       /* Print(head);
        head=reverseList(head);
        Print(head);*/
        ListNode target=FindKthToTail1(head,2);
        System.out.println(target.val);
//        ListNode target=FindKthToTail1(l1,1);
//        System.out.println(target.val);
    }
}

