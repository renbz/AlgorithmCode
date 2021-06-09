package 阿里巴巴.R_5月7日笔试题;

/**
 * @author Ren
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main02 {

    //初次遍历结果（循环前）
    static int [] res1 ;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        res1 = new int[n];

        int [] arr = new int[n];
        //首先读入数组
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        //根据数组构建一颗二叉树

        BiTree root = new BiTree(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            root.add(new BiTree(arr[i]));
        }

        //按层遍历
        BiTree.bl(root);


        // 得到初次遍历后的结果    循环有规律，1个，2个，4个，2方的n-1次个
        // 等比数列求和 2的n次方-1
        // 判断树的高度

        int h = BiTree.getH(root);
        System.out.print(root.value+" ");
        for (int i = 1; i < h-1; i++) {
            // 第一次读入一个，第二次2个，第三次4个
            xunhuan(k,(int)(Math.pow(2,i)-1),(int)(Math.pow(2,i+1)-1));
        }
        xunhuan(k,(int)(Math.pow(2,h-1)-1),list.size());

    }

    public static void xunhuan(int k,int start , int end ){
        k = k%(end-start+2);
        for (int i = end-k; i < end; i++) {
            System.out.print(list.get(i)+" ");
        }
        for (int i = start; i < end-k; i++) {
            System.out.print(list.get(i)+" ");
        }
    }




    /**
     * 二叉树结点
     */
    public static class BiTree{
        public int value;
        public BiTree left;
        public BiTree right;

        public BiTree(int value) {
            this.value = value;
        }

        /**
         * 添加元素的方法
         */
        public void add(BiTree the){
            if(the.value < value){
                if(left ==null){
                    left = the;
                }else{
                    left.add(the);
                }
            }else{
                if(right ==null){
                    right = the;
                }else{
                    right.add(the);
                }
            }
        }

        // 二叉树的按层遍历
        public static void bl(BiTree node){
            Queue<BiTree> queue = new LinkedList<BiTree>();
            queue.offer(node);
            while(!queue.isEmpty()){
                node = queue.poll();
                list.add(node.value);
                //System.out.println(node.value + "  ");
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }

            }
        }

        // 获取平衡二叉树高度

        public static int getH(BiTree node){
            int h = 1;
            if(node.left != null){
                h++;
            }
            return h;
        }
    }
}
