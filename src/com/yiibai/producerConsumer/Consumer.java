package com.yiibai.producerConsumer;

import java.util.ArrayList;

public class Consumer implements Runnable {
	private final ArrayList<Integer> list;  
    private final int SIZE;
    private int count;
    public Consumer(ArrayList<Integer> list, int size,int count) {  
        this.list = list;  
        this.SIZE = size;  
        this.count=count;
    }
    
	public void run() {
		while(count>0){
			synchronized (list) {
				try{
					while(list.size()==0){
						System.out.println("无货，请等待生产");
						list.wait();
					}
					list.remove(list.size()-1);
					System.out.println("消费者消费了  1 个");
					list.notify();
					Thread.sleep(50);
				}catch (Exception e) {
					System.out.println("Consumer 异常");;
				}
			}
			count--;
		}
	}

}
