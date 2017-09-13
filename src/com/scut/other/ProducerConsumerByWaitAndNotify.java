package com.scut.other;

import java.util.LinkedList;
import java.util.Objects;

/**
 * 生产者和消费真实现的另外一种方式
 * 使用notify、wait来实现消费者和生产者模式
 * @author wwh
 * @create 2017-09-07 22:05
 **/
public class ProducerConsumerByWaitAndNotify {

    static class Storage{
        private final int MAX_SIZE=100;

        private LinkedList<Object> list=new LinkedList<Object>();

        public void produce(int num){
            //lock.lock();  不使用synchronized 采用lock await singalAll() 来实现线程之间的同步操作
            synchronized (list){
                while (list.size()+num>MAX_SIZE){
                    System.out.println("cannot produce product,storage is not enough");
                    try{
                        list.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

                for(int i=0;i<num;i++){
                    list.add(new Object());
                }

                System.out.println("product has been produced"+num+"storage is "+list.size());
                list.notifyAll();
            }
        }


        public void consume(int num){
            synchronized (list){
                while (list.size()<num){
                    System.out.println("storage is not enough,cannot consume");
                    try {
                        list.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

                for(int i=0;i<num;i++){
                    list.remove();
                }

                System.out.println("product has been consumed"+num+"storage is "+list.size());

                list.notifyAll();

            }
        }

        // get/set方法
        public LinkedList<Object> getList()
        {
            return list;
        }

        public void setList(LinkedList<Object> list)
        {
            this.list = list;
        }

        public int getMAX_SIZE()
        {
            return MAX_SIZE;
        }
    }

    class Producer extends Thread  {
        private int num;
        private  Storage storage;
        public Producer(Storage storage){
            this.storage=storage;
        }

        public void produce(int num){
            storage.produce(num);
        }

        @Override
        public void run() {
            produce(num);
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public Storage getStorage() {
            return storage;
        }

        public void setStorage(Storage storage) {
            this.storage = storage;
        }
    }


    class  Consumer extends Thread{
        private int num;
        private  Storage storage;
        public Consumer(Storage storage){
            this.storage=storage;
        }

        public void consume(int num){
            storage.consume(num);
        }

        @Override
        public void run() {
            consume(num);
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public Storage getStorage() {
            return storage;
        }

        public void setStorage(Storage storage) {
            this.storage = storage;
        }
    }

}


