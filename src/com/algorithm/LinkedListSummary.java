package com.algorithm;

import java.util.HashMap;

/**
 * Created by WWH on 2017/4/12.
 * 关于链表常见操作的合集
 */
public class LinkedListSummary {

    public static class Node{
        int value;
        Node next;
        public Node(int n){
            this.value=n;
            this.next=null;
        }
    }

    /**
     * 反转单链表，逆序非递归实现 头插法
     * @param head
     * @return
     */
    public  static Node reverseList(Node head){
        if(head==null||head.next==null) return  head;
        Node pre=null;
        Node nex=null;
        while(head!=null){
            nex=head.next;
            head.next=pre;
            pre=head;
            head=nex;
        }
        return pre;
    }

    /**
     * 使用递归实现链表的逆序
     * @param head
     * @return
     */
    public static Node reverseListRec(Node head){
        if(head==null||head.next==null) return  head;
        Node rhead=reverseListRec(head.next);
        head.next.next=head;
        head.next=null;
        return  rhead;

    }

    /**
     * 查找单链表的中间节点
     * 使用两个指针一个快指针一个慢指针 快指针走一步 慢指针走两步
     * @param head
     * @return
     */
    public static Node FindMiddleNode(Node head){
        if(head==null||head.next==null) return  head;
        Node target=head;
        Node temp=head;
        while (temp!=null&&temp.next!=null){
            target=target.next;
            temp=temp.next.next;
        }
        return target;
    }

     /**
     * 求单链表中结点的个数: getListLength
     * @param head
     * @return
     */
    public static int getListLength(Node head){
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
    }

     /**
     * //查找单链表中的倒数第K个结点（k > 0）
     * @param head
     * @param k
     * @return
     */
    public static Node reGetKthNode(Node head,int k){
        if(head==null)return head;
        int len=getListLength(head);
        if(k>len)return null;
        Node target=head;
        Node nexk=head;
        for(int i=0;i<k;i++){
            nexk=nexk.next;
        }
        while(nexk!=null){
            target=target.next;
            nexk=nexk.next;
        }
        return target;
    }

     /**
     * 判断一个单链表中是否有环,快慢指针
     * @param head
     * @return
     */
    public static boolean hasCycle(Node head){
        boolean flag=false;
        Node p1=head;
        Node p2=head;
        while(p1!=null&&p2!=null){
            p1=p1.next;
            p2=p2.next.next;
            if(p2==p1){
                flag=true;
                break;
            }
        }
        return flag;
    }

     /**
     * 合并两个有序的单链表head1和head2，循环
     * @param head1
     * @param head2
     * @return
     */
    public static Node mergeSortedList(Node head1,Node head2){
        if(head1==null)return head2;
        if(head2==null)return head1;
        Node target=null;
        if(head1.value>head2.value){
            target=head2;
            head2=head2.next;
        }
        else{
            target=head1;
            head1=head1.next;
        }
        target.next=null;
        Node mergeHead=target;
        while(head1!=null && head2!=null){
            if(head1.value>head2.value){
                target.next=head2;
                head2=head2.next;
            }
            else{
                target.next=head1;
                head1=head1.next;
            }
            target=target.next;
            target.next=null;
        }
        if(head1==null)target.next=head2;
        else target.next=head1;
        return mergeHead;
    }

     /**
     * 合并两个有序的单链表head1和head2，递归
     * @param head1
     * @param head2
     * @return
     */
    public static Node mergeSortedListRec(Node head1,Node head2){
        if(head1==null)return head2;
        if(head2==null)return head1;
        if(head1.value>head2.value){
            head2.next=mergeSortedListRec(head2.next,head1);
            return head2;
        }
        else{
            head1.next=mergeSortedListRec(head1.next,head2);
            return head1;
        }
    }

    /**
     * 对单链表进行排序,归并排序,在排序里面不建议选用递归的合并有序链表算法，如果链表长度较长，很容易出现栈溢出
     * @param head
     * @return
     */
    public static Node listSort(Node head){
        Node nex=null;
        if(head==null||head.next==null)return head;
        else if(head.next.next==null){
            nex=head.next;
            head.next=null;
        }
        else{
            Node mid=FindMiddleNode(head);
            nex=mid.next;
            mid.next=null;
        }
        return mergeSortedList(listSort(head),listSort(nex));//合并两个有序链表，不建议递归
    }

     /**
     * 对单链表进行排序,插入排序
     * @param head
     * @return
     */
    public Node insertionSortList(Node head) {
        if(head==null||head.next==null)return head;
        Node pnex=head.next;
        Node pnex_nex=null;
        head.next=null;
        while(pnex!=null){
            pnex_nex=pnex.next;
            Node temp=head;
            Node temp_pre=null;
            while(temp!=null){
                if(temp.value>pnex.value)break;
                temp_pre=temp;
                temp=temp.next;
            }
            if(temp_pre==null){
                head=pnex;
                pnex.next=temp;
            }
            else{
                temp_pre.next=pnex;
                pnex.next=temp;
            }
            pnex=pnex_nex;
        }
        return head;
    }

     /**
     *判断两个单链表是否相交,如果相交返回第一个节点，否则返回null
     *如果单纯的判断是否相交，只需要看最后一个指针是否相等
     * @param head1
     * @param head2
     * @return
     */
    public static Node isIntersect(Node head1,Node head2){
        Node target=null;
        if(head1==null||head2==null)return target;
        int len1=getListLength(head1);
        int len2=getListLength(head2);
        if(len1>=len2){
            for(int i=0;i<len1-len2;i++){
                head1=head1.next;
            }
        }else{
            for(int i=0;i<len2-len1;i++){
                head2=head2.next;
            }
        }
        while(head1!=null&&head2!=null){
            if(head1==head2){
                target=head1;
                break;
            }
            else{
                head1=head1.next;
                head2=head2.next;
            }
        }
        return target;
    }

    /**
     * 已知一个单链表中存在环，求进入环中的第一个节点,利用hashmap，
     * 不要用ArrayList，因为判断ArrayList是否包含某个元素的效率不高
     * @param head
     * @return
     */
    public static Node getFirstNodeInCycleHashMap(Node head){
        Node target=null;
        HashMap<Node,Boolean> map=new HashMap<Node,Boolean>();
        while(head!=null){
            if(map.containsKey(head))target=head;
            else{
                map.put(head, true);
            }
            head=head.next;
        }
        return target;
    }

    /**
     * 已知一个单链表中存在环，求进入环中的第一个节点,不用hashmap
     *用快慢指针，与判断一个单链表中是否有环一样，找到快慢指针第一次相交的节点，
     * 此时这 个节点距离环开始节点的长度和链表头距离环开始的节点的长度相等
     * @param head
     * @return
     */
    public static Node getFirstNodeInCycle(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)break;
        }
        if(fast==null||fast.next==null)return null;//判断是否包含环
        //相遇节点距离环开始节点的长度和链表投距离环开始的节点的长度相等
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }//同步走
        return slow;

    }


    /**
     * 给出一单链表头指针head和一节点指针delete，O(1)时间复杂度删除节点delete
     *可惜采用将delete节点value值与它下个节点的值互换的方法，但是如果delete是最后一个节点，则不行，但是总得复杂度还是O(1)
     * @param head
     * @param delete
     */
    public static void deleteNode(Node head,Node delete){
        //首先处理delete节点为最后一个节点的情况
        if(delete==null)return;
        if(delete.next==null){
            if(head==delete)head=null;
            else{
                Node temp=head;
                while(temp.next!=delete){
                    temp=temp.next;
                }
                temp.next=null;
            }
        }
        else{
            delete.value=delete.next.value;
            delete.next=delete.next.next;
        }
        return;
    }

    public static void main(String[] args) {

    }

}
