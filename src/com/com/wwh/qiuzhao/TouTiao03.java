package com.com.wwh.qiuzhao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
/**
 * 头条在线编程03 查询喜好
 * 5
 * 1 2 3 3 5
 * 3
 * 1 2 1
 * 2 4 5
 * 3 5 3
 *
 * output:
 * 1
 * 0
 * 2
 * @author wwh
 * @create 2017-09-10 19:18
 * 重复珠子的题目
 * http://paste.ubuntu.com/25506027/
 * 头条的题目
 * 还有线段树需要学些下如何写
 * 以及头条串珠子的题目
 * https://www.nowcoder.com/discuss/39735?type=0&order=0&pos=40&page=1
 **/
public class TouTiao03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            HashMap<Integer,List<Integer>> map=new HashMap<>();
            for(int i=1;i<=n;i++){
                int key=sc.nextInt();
                List<Integer> list=new ArrayList<Integer>();
                if(map.containsKey(key)){
                    list.addAll(map.get(key));
                    list.add(i);
                    map.put(key,list);
                }else {
                    list.add(i);
                    map.put(key,list);
                }

            }

            int time=sc.nextInt();
            for (int j=0;j<time;j++){
                int []query=new int[3];
                for(int k=0;k<3;k++){
                    query[k]=sc.nextInt();
                }

                int count=0;
                if(map.containsKey(query[2])){
                    for(int t=0;t<map.get(query[2]).size();t++){
                        //这个地方的查找可以优化为二分查找  否则查找效率还是o(n)
                       if(map.get(query[2]).get(t)>=query[0]&&map.get(query[2]).get(t)<=query[1]){
                           count++;
                       }
                    }
                }
                System.out.println(count);
            }

        }
    }

    /*
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int [] like=new int[n];
            for(int i=0;i<n;i++){
                like[i]=sc.nextInt();
            }

            int time=sc.nextInt();
            for(int j=0;j<time;j++){
                int []query=new int[3];
                for(int k=0;k<3;k++){
                    query[k]=sc.nextInt();
                }
                int count=0;
                for(int t=query[0]-1;t<=query[1]-1;t++){
                    if(like[t]==query[2])
                        count++;
                }
                System.out.println(count);
            }
        }
    }
    */
}
/**
 * #include<iostream>
 #include<vector>
 #include<map>
 #include<algorithm>
 using namespace std;
 int main()
 {
 int n,q,val,l,r;
 cin>>n;
 map<int,vector<int> > m;
 for(int i=1;i<=n;i++)
 {
 cin>>val;
 if(m.find(val)==m.end())
   m[val]=vector<int>();
   m[val].push_back(i);
 }

 cin>>q;
 for(int i=0;i<q;i++)
 {
 cin>>l>>r>>val;
 cout<<upper_bound(m[val].begin(),m[val].end(),r)-lower_bound(m[val].begin(),m[val].end(),l)<<endl;
 }

 return 0;
 }
 */


/**
 * import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Scanner;

 public class Main {
 public static void main(String[] args) {
 Scanner scan=new Scanner(System.in);
 int num=scan.nextInt();
 int[] nums=new int[num];
 for(int i=0;i<num;i++){
 nums[i]=scan.nextInt();
 }
 Main main=new Main();
 main.buildTree(nums);
 int count=scan.nextInt();
 List<Integer> re=new ArrayList<Integer>();
 //for(int i=0;i<main.tree.length;i++){
 //	System.out.println(main.tree[i]);
 //}
 for(int i=0;i<count;i++){
 re.add(main.querySum(0, scan.nextInt()-1, scan.nextInt()-1, scan.nextInt()));
 }
 for(int a:re) System.out.println(a);
 }
 public void buildTree(int[] nums){
 tree=new Node[nums.length*2-1];
 build(0,0,nums.length-1,nums);
 }
 Node[] tree;
 public void build(int root,int left,int right,int[] nums){
 if(left==right){
 tree[root]=new Node(left,right);
 tree[root].map.put(nums[left], 1);
 return;
 }
 build(root*2+1,left,(left+right)/2,nums);
 build(root*2+2,(left+right)/2+1,right,nums);
 HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
 Node l=tree[root*2+1];
 Node r=tree[root*2+2];
 for(Integer a:l.map.keySet()){
 if(!map.containsKey(a)) map.put(a, 0);
 map.put(a,map.get(a)+1);
 }
 for(Integer a:r.map.keySet()){
 if(!map.containsKey(a)) map.put(a, 0);
 map.put(a,map.get(a)+1);
 }
 tree[root]=new Node(left,right);
 tree[root].map=map;
 }
 public int querySum(int root,int begin,int end,int val){
 if(tree[root].left==begin&&tree[root].right==end){
 Integer a=tree[root].map.get(val);
 return a==null?0:a;
 }
 int mid=(tree[root].left+tree[root].right)/2;
 if(end<=mid)
 return querySum(root*2+1,begin,end,val);
 else{
 if(begin>mid) return querySum(root*2+2,begin,end,val);
 else return querySum(root*2+1,begin,mid,val)+querySum(root*2+2,mid+1,end,val);
 }
 }
 class Node{
 int left,right;
 HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
 public Node(int left, int right) {
 this.left = left;
 this.right = right;
 }
 @Override
 public String toString() {
 return "Node [left=" + left + ", right=" + right + ", map=" + map
 + "]";
 }

 }

 }

 */
