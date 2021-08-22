package 爱奇艺;

import java.util.Scanner;
import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class Main04_多线程打印奇偶数 {
    public static void main(String[] args) {
        final Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(n);
        new Thread(() -> {
            try {
                zeroEvenOdd.printZero(System.out::print);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                zeroEvenOdd.printEven(System.out::print);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                zeroEvenOdd.printOdd(System.out::print);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    static class ZeroEvenOdd {
        private int n;

        Semaphore zero = new Semaphore(1);
        Semaphore odd = new Semaphore(0);
        Semaphore even = new Semaphore(0);

        public ZeroEvenOdd(int n) {
            this.n = n;
        }

        public void printZero(IntConsumer printNumber) throws InterruptedException {
            for (int i = 1; i <= n; i++) {
                zero.acquire();
                printNumber.accept(0);
                if (i % 2 == 1) {
                    odd.release();
                } else {
                    even.release();
                }
            }
        }

        public void printEven(IntConsumer printNumber) throws InterruptedException {

            for (int i = 2; i <= n; i =i+ 2) {
                even.acquire();
                printNumber.accept(i);
                zero.release();
            }
        }

        public void printOdd(IntConsumer printNumber) throws InterruptedException {
            for (int i = 1; i <= n; i += 2) {
                odd.acquire();
                printNumber.accept(i);
                zero.release();
            }
        }


    }
}

