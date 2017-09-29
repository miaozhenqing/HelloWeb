package com.qing.tree2;

import java.util.ArrayList;
import java.util.List;

public class Tree {
	private List<Node> nodeList;
	
	//把数组的值当做节点存入树种
	public List<Node> createTree(int[] a){
		nodeList=new ArrayList<Node>();
		//先将数组的值转换成node对象
		for(int i=0;i<a.length;i++){
			Node node=new Node(a[i]);
			nodeList.add(node);
		}
		//建立二叉树结构(左=父*2+1；右=父*2+2)
		for(int i=0;i<nodeList.size()/2-1;i++){
			// 左孩子  
            nodeList.get(i).setLeft(nodeList.get(i * 2 + 1));  
            // 右孩子  
            nodeList.get(i).setRight(nodeList.get(i * 2 + 2)); 
		}
		// 最后一个父节点:因为最后一个父节点可能没有右孩子，所以单独拿出来处理  
        int lastParentIndex = a.length / 2 - 1;  
        // 左孩子  
        nodeList.get(lastParentIndex).setLeft(nodeList.get(lastParentIndex * 2 + 1));  
        // 右孩子,如果数组的长度为奇数才建立右孩子  
        if (a.length % 2 == 1) {  
            nodeList.get(lastParentIndex).setRight(nodeList.get(lastParentIndex * 2 + 2));  
        }
		return nodeList;
	}
		
	//前序遍历
	public void preOrderTraverse(Node node) {  
        if (node == null)  
            return;  
        System.out.print(node.getData() + " ");  
        preOrderTraverse(node.getLeft());  
        preOrderTraverse(node.getRight());  
    }
	//中序遍历
	public void inOrderTraverse(Node node) {  
        if (node == null)  
            return;  
        inOrderTraverse(node.getLeft());  
        System.out.print(node.getData() + " ");  
        inOrderTraverse(node.getRight());  
    }  
	//后序遍历    
    public void postOrderTraverse(Node node) {  
        if (node == null)  
            return;  
        postOrderTraverse(node.getLeft());  
        postOrderTraverse(node.getRight());  
        System.out.print(node.getData() + " ");  
    }
	//********************************方法二****************************************
    	//把数组的值当做节点存入树
  		public List<Node> createTree2(int[] a){
  			nodeList=new ArrayList<Node>();
  			//先将数组的值转换成node对象
  			for(int i=0;i<a.length;i++){
  				Node node=new Node(a[i]);
  				nodeList.add(node);
  			}
  			for(int i=1;i<a.length;i++){
  				insert(nodeList.get(0),nodeList.get(i).getData());
  			}
  			return nodeList;
  		}
  		public void insert(Node root,int data){
  			if(data<root.getData()){
  				if(root.getLeft()!=null){
  					insert(root.getLeft(),data);
  				}else{
  					root.setLeft(new Node(data));
  				}
  			}else{
  				if(root.getRight()!=null){
  					insert(root.getRight(),data);
  				}else{
  					root.setRight(new Node(data));
  				}
  			}
  		}
  		//前序遍历
  		public void pro(Node node){
  			if(node!=null){
  				System.out.print(node.getData()+" ");
  				pro(node.getLeft());
  				pro(node.getRight());
  			}else{
  				return;
  			}
  		}
  		//中序遍历
  		public void middle(Node node){
  			if(node!=null){
  				middle(node.getLeft());
  				System.out.print(node.getData()+" ");
  				middle(node.getRight());
  			}else{
  				return;
  			}
  		}
  		//后序遍历
  		public void after(Node node){
  			if(node!=null){
  				after(node.getLeft());
  				after(node.getRight());
  				System.out.print(node.getData()+" ");
  			}else{
  				return;
  			}
  		}
}
