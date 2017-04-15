package com.algorithm;

/**
 * Created by WWH on 2017/3/21.
 * 参考:http://www.cnblogs.com/hapjin/p/5508284.html
 * 三，求解最低公共父结点的算法实现
 有两种思路，一种是通过中序遍历和后序遍历。由于中序遍历是先左子树中的结点，再访问根，再访问右子树中结点，
 因此这两个结点的公共父结点一定处于这两个结点之间。如：中序遍历：8, 4, 9, 2, 5, 1, 6, 3, 7     结点2处于结点8 和 结点5 之间，也就是说：结点8 和 结点5 的最低公共父结点在 [8~5]之间的候选结点，这里为{4,9,2}中取
 后序遍历是先访问左右子树中的结点，最后再访问根。故这两个结点的最低公共父结点一定处于 结点8 和 结点5 之后的结点，且是第一个出现在{4,9,2}中的那个结点。
 后序遍历：8, 9, 4, 5, 2, 6, 7, 3, 1      8->9->4->5 这之后的结点，才可能是 结点8 和 结点5 的父结点。
 另一种方法则是：递归，首先从树根开始考虑：
 ①结点A 和 结点B 要么都在树根的左子树中；②要么都在树根的右子树中；③要么一个在左子树中，一个在右子树中。
 这是一个分治算法，对于情况①和②，可以继续递归分解。对于情况③属于代码第10行判断，复杂度为O(1)
 递归表达式可表示为：T(N)=2T(N/2)+O(1)，解得T(N)=O(N)
 对于③，最低公共父结点为树根。
 对于①，可以进一步判断，从树根的左孩子结点考虑：
 1)结点A 和 结点B 要么都在树根的左子孩子 的 左子树中；2)要么都在树根的左孩子 的 右子树中；3) 要么一个在树根的左孩子的 左子树中，一个在树根的左孩子 的 右子树中。
 对于②，可以进一步判断，从树根的右孩子的结点考虑：
 1)结点A 和 结点B 要么都在树根的右子孩子 的 左子树中；2)要么都在树根的右孩子 的 右子树中；3) 要么一个在树根的右孩子的 左子树中，一个在树根的右孩子 的 右子树中。
 下面代码实现递归求解最低公共父结点。
 */
public class CommonParentNode {
    /**
     * 求解node1 和 node2 的最低公共父结点
     * @param node1
     * @param node2
     * @return 最低公共父结点
     */
    public BinaryNode<Integer> commonNode(BinaryNode<Integer> node1, BinaryNode<Integer> node2, BinaryNode<Integer> root){
        if(root == null)
            return null;
        if(node1.element == root.element || node2.element == root.element)
            return root;
        /*
         * 若 left==null, node1,node2 都不在 root.left子树中
         * 若right==null,node1,node2 都不在root.right子树中
         */
        BinaryNode<Integer> left = commonNode(node1, node2, root.left);
        BinaryNode<Integer> right = commonNode(node1, node2, root.right);

        if(left != null && right != null)
            return root;
        return left == null ? right : left;
    }
    public static void main(String[] args) {


    }
}
class BinaryNode<T>{
    T element;
    BinaryNode left;
    BinaryNode right;
    BinaryNode(T val){
        this.element=val;

    }


}
