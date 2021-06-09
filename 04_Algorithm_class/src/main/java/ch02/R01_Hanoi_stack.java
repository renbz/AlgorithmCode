package ch02;

import java.util.Stack;

/**
 * @author Ren
 * 非递归实现汉诺塔
 */

public class R01_Hanoi_stack {

    public static void main(String[] args) {

        Stack stackA = new Stack();
        stackA.push(1);
        stackA.push(2);
        stackA.push(3);
        stackA.push(4);

        Stack stackB = new Stack();
        Stack stackC = new Stack();

        hanota(stackA,stackB,stackC);
    }

    public static void hanota(Stack<Integer> Az, Stack<Integer> Bz, Stack<Integer> Cz) {
        move(Az.size(), Az, Bz,Cz);
    }

    public static void move(int n, Stack<Integer> A, Stack<Integer> B, Stack<Integer> C){
        if (n == 1){
            //A->C
            C.push(A.pop());
            System.out.println("将第"+n+"个圆盘，从"+A.getClass()+"柱移动到"+C.getClass()+"柱");
            return;
        }

        // 从A->B
        move(n-1, A, C, B);
        // 从A->C
        C.push(A.pop());
        System.out.println("将第"+n+"个圆盘，从"+A+"柱移动到"+B+"柱");
        // 从B->C
        move(n-1, B, A, C);

    }


}
