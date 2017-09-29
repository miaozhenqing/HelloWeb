package com.yiibai.producerConsumer;

import java.util.ArrayList;

public class Producer implements Runnable{
	private final ArrayList<Integer> list;  
    private final int MAX;  
    private int count;  
    public Producer(ArrayList<Integer> list, int MAX,int count) {  
        this.list = list;  
        this.MAX = MAX;  
        this.count=count;
    }  
	public void run() {
		while(count>0){
			synchronized (list) {
				try{
					while(list.size()==MAX){
						System.out.println("货物已满");
						list.wait();
					}
					list.add(1);
					System.out.println("生产者生产了  1 个");
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
