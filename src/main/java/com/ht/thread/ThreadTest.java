package com.ht.thread;

public class ThreadTest {

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();
        threadDemo.run();
    }
}

class ThreadDemo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
