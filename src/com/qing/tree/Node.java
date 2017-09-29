package com.qing.tree;

public class Node<T> {
	private T data;   //存储的数据
    private int parent;   //父亲节点的下标

    public Node(){  
    }  
      
    public Node(T data){  
        this.data = data;  
    }  
      
    public Node(T data,int parent){  
        this.data = data;  
        this.parent = parent;  
    }

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	} 
    
}
