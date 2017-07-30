package com.offer.oj;

/**
 * 输入一个复杂链表
 *
 * @author wwh
 * @create 2017-07-30 23:13
 **/
public class RandomListNodeClone {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null) return null;
        RandomListNode newNode=new RandomListNode(pHead.label);
        newNode.random=pHead.random;
        newNode.next=Clone(pHead.next);
        return newNode;

    }

}

 class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
