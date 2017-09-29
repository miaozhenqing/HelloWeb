package com.qing.tree3;

import java.util.ArrayList;
import java.util.List;

public class Tree {
	List<Node> nodeList = null;
	public void getTree(int[] a){
		nodeList=new ArrayList<Node>(a.length);
		//把数组的值转化成Node对象
		for(int i=0;i<a.length;i++){
			nodeList.add(new Node(a[i]));
		}
		Node root=nodeList.get(0);
		for(int i=1;i<nodeList.size();i++){
			createTree(root,nodeList.get(i).getData());
		}
	}
	public void createTree(Node root,int a){
		if(a<root.getData()){
			if(root.getLeft()!=null){
				createTree(root.getLeft(),a);
			}else{
				root.setLeft(new Node(a));
			}
		}else{
			if(root.getRight()!=null){
				createTree(root.getRight(),a);
			}else{
				root.setRight(new Node(a));
			}
		}
	}
}
