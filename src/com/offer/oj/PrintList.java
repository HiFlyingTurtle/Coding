package com.offer.oj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * Created by WWH on 2017/3/21.
 * 从尾部到头部打印链表的值
 */
public class PrintList {
    //1.借用一个数组将数组逆序输出
    public ArrayList<Integer> printListFromTailToHead0(ListNode listNode) {
        ArrayList<Integer> li=new ArrayList<>();
        ArrayList<Integer> li1=new ArrayList<>();
        ListNode n=listNode;
        while (n!=null){
            li.add(n.val);
            n=n.next;
        }
       for (int i=li.size()-1;i>=0;i--){
           li1.add(li.get(i));
       }
        return li1;
    }

    //2.利用集合的reverse方法
    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode){
        ArrayList<Integer> li=new ArrayList<>();
        ListNode n=listNode;
        while (n!=null){
            li.add(n.val);
            n=n.next;
        }
        Collections.reverse(li);
        return li;
    }

    //3.每次将插入的元素放在第一个位置
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode){
        ArrayList<Integer> li=new ArrayList<>();
        while (listNode!=null){
            li.add(0,listNode.val);
            listNode=listNode.next;
        }
        return  li;

    }

    //4.利用栈来实现(递归本质上也是利用栈来实现的)
    public ArrayList<Integer> printListFromTailToHead3(ListNode listNode){
        ArrayList<Integer> li=new ArrayList<>();
        Stack<Integer> sa=new Stack<>();
        while (listNode!=null){
            sa.push(listNode.val);
            listNode=listNode.next;
        }
        while (!sa.isEmpty()){
            li.add(sa.pop());
        }
        return  li;

    }

    //5.利用递归来实现相应的代码程序或者利用头插法就链表逆置再输出 再逆置回去。
    private void helper(ArrayList<Integer> res,ListNode head){
        if(head!=null){
            if(head.next!=null){
                helper(res,head.next);
            }
            res.add(head.val);
        }
    }

    public ArrayList<Integer> printListFromTailToHead4(ListNode listNode){
        ArrayList<Integer> res=new ArrayList<>();
        helper(res, listNode);
        return res;



    }


    public static void main(String[] args) {

    }

}


/**
 *链表节点的定义
 */
class ListNode {
            int val;
            ListNode next = null;
            ListNode(int val) {
                    this.val = val;
            }
}