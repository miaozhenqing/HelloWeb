package com.qing.tree2;

import java.util.List;

public class Client {

	public static void main(String[] args) {
		Tree tree=new Tree();
		int[] a = { 5, 6, 7,3, 4, 8,1, 2,   9 };  
		List<Node> list = tree.createTree2(a);
		
		
	}

}
