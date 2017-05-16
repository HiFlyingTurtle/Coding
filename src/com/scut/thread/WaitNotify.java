package com.scut.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * 等待/通知机制的模型 wait/notify实现
 * @author wwh
 * @create 2017/5/13
 */
public class WaitNotify {
    static boolean flag=true;
    static Object lock=new Object();
    public static void main(String[] args) throws InterruptedException {
        Thread waitThread=new Thread(new Wait(),"WaitThread");
        waitThread.start();

        TimeUnit.SECONDS.sleep(1);

        Thread notifyThread=new Thread(new Notify(),"NotifyThread");
        notifyThread.start();

    }

    static class Wait implements Runnable{

        @Override
        public void run() {
            synchronized (lock){
                while (flag){
                    try {
                        System.out.println(Thread.currentThread() + "flag is true .wait @" + new SimpleDateFormat("HH:mm:ss").format(new Date()));
                        lock.wait();
                        System.out.println("waiting...");
                    }catch (InterruptedException e){
                             e.printStackTrace();
                    }
                }
                //条件满足的时候，完成工作
                System.out.println(Thread.currentThread()+"flag is false .running @" +new SimpleDateFormat("HH:mm:ss").format(new Date()));

            }

        }
    }

    static  class Notify implements  Runnable{
        @Override
        public void run() {
            synchronized (lock){
                System.out.println(Thread.currentThread()+"hold lock .notify @ " +new SimpleDateFormat("HH:mm:ss").format(new Date()));
                lock.notifyAll();
                flag=false;
                SleepUtils.second(5);
                System.out.println("sleeping...");
            }

            synchronized (lock){
                System.out.println(Thread.currentThread()+"hold lock again .notify @ " +new SimpleDateFormat("HH:mm:ss").format(new Date()));
            }
        }
    }


}

