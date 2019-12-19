package com.ht.thread;

public class RunnableTest {
    public static void main(String[] args){
        Thread thread = new Thread(new RunnableDemo());
        thread.start();
    }
}
class RunnableDemo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
