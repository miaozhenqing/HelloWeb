package com.yiibai.producerConsumer;

import java.util.ArrayList;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		Producer p=new Producer(list,2,10);
		Consumer c=new Consumer(list,2,10);
		Thread pp=new Thread(p,"Producer");
		Thread cc=new Thread(c,"Consumer");
		pp.start();
		cc.start();
	}

}
