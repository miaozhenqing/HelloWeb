package com.qing.link;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Link link=new Link();
		link.addNode(0);
		link.addNode(1);
		link.addNode(2);
		link.addNode(3);
		link.addNode(4);
		link.addNode(5);
		link.addNode(6);
		
		System.out.println(link.getLength());
	}

}
