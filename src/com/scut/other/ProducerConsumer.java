package com.scut.other;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 生产者和消费者模式的实现
 * 采用阻塞队列来实现消息队列
 * 生产者消费者模式是通过一个容器来解决生产者和消费者的强耦合问题。
 * 生产者和消费者彼此之间不直接通讯，而通过阻塞队列来进行通讯。
 * @author wwh
 * @create 2017-09-07 21:44
 **/
public class ProducerConsumer {
    static class MsgQueueManager<T>{
        /**
         * 消息队列
         */
        public  final BlockingQueue<T> messageQueue;

        MsgQueueManager(BlockingQueue<T> messageQueue) {
            this.messageQueue = messageQueue;
        }

        MsgQueueManager() {
            this.messageQueue=new LinkedBlockingQueue<>();
        }

        public T take(){
            try {
                //java queue操作方法有take poll; take方法是阻塞的，如果队列为空则阻塞当前的线程
                messageQueue.take();
            }catch (InterruptedException e){
                 Thread.currentThread().interrupt();
            }

            return null;
        }

        public void put(T msg){
            try{
                //put 方法也会阻塞队列
                messageQueue.put(msg);
            }catch (InterruptedException e){

            }
        }

    }
     //生产者负责生产对象
    static class Producer extends Thread{
        private  MsgQueueManager msgQueueManager;

        public Producer(MsgQueueManager msgQueueManager){
            this.msgQueueManager=msgQueueManager;
        }

        @Override
        public void run() {
            msgQueueManager.put(new Object());
        }
    }

    //消费者负责取对象
    static class Consumer extends Thread{
        private  MsgQueueManager msgQueueManager;

        public Consumer(MsgQueueManager msgQueueManager){
            this.msgQueueManager=msgQueueManager;
        }

        @Override
        public void run() {
            msgQueueManager.take();
        }
    }
    public static void main(String[] args) {

    }
}
