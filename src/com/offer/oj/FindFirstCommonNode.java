package com.offer.oj;
/**
 * 输入两个链表，找出它们的第一个公共结点。
 * @author wwh
 * @create 2017-08-12 14:06
 **/
public class FindFirstCommonNode {
    /**
     * 获取链表的长度
     * @param pHead
     * @return
     */
    private static int  getListLength(ListNode pHead){
        if(pHead==null) return 0;
        int length=0;
        while(pHead!=null){
            pHead=pHead.next;
            length++;
        }
        return length;
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null||pHead1==null) return null;
        int length1=getListLength(pHead1);
        int length2=getListLength(pHead2);
        ListNode pLong=pHead1;
        ListNode pShort=pHead2;
        int lengthDiff=length1-length2;

        if(length1<length2){
            pLong=pHead2;
            pShort=pHead1;
            lengthDiff=length2-length1;
        }

        for(int i=0;i<lengthDiff;i++){
            pLong=pLong.next;
        }

        while((pLong!=null)&&(pShort!=null)&&(pLong!=pShort)){
            pShort=pShort.next;
            pLong=pLong.next;
        }
        ListNode commonNode=pLong;
        return commonNode;

    }
}
