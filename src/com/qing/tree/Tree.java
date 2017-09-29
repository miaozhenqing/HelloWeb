package com.qing.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tree<T>{
	private final int DEFAULT_SIZE=2;
	private int size;
	private Object[] nodes;
	private int count;
	
	public Tree(){
		this.size=DEFAULT_SIZE;
		this.nodes=new Object[this.size];
		this.count = 0;
	}
	
	public Tree(Node<T> root){
		this();
		this.count = 1;
		this.nodes[0]=root;
	}
	
	public Tree(Node<T> root,int size){
		this.size=size;
		this.nodes=new Object[this.size];
		this.nodes[0]=root;
		this.count = 1;
	}
	//添加一个节点
	public void addNode(Node<T> node){
		for (int i = 0; i < this.size; i++) {  
		    if (this.nodes[i] == null) {  
			    nodes[i] = node;  
			    break;  
		    }  
	    }
		this.count++;
	}
	
	//添加一个节点，并指明父节点
	public void addNode(Node<T> node,Node<T> parentNode){
		this.check();
		node.setParent(this.getPosition(parentNode));
		this.addNode(node);
	}
	
	//获取节点在数组的存储位置  
    public int getPosition(Node<T> node) {  
        for (int i = 0; i < this.size; i++) {  
            if (nodes[i]==node) {  
                return i;  
            }  
        }  
        return -1;  
    }
	//check数组长度
	public void check(){  
        if(this.count >= this.size){  
            this.enlarge();  
        }  
    }
	//填充数组
	public void enlarge(){  
        this.size = this.size + this.DEFAULT_SIZE;  
        Object[] newNodes = new Object[this.size];  
        newNodes = Arrays.copyOf(nodes, this.size);  
        Arrays.fill(nodes, null);  
        this.nodes = newNodes;  
        System.out.println("enlarge");  
    }
	//获取整棵树有多少节点  
    public int getSize(){  
        return this.count;  
    }
    //获取根节点  
    @SuppressWarnings("unchecked")  
    public Node<T> getRoot(){  
        return (Node<T>) this.nodes[0];  
    }
    //获取所有节点，以List形式返回  
    @SuppressWarnings("unchecked")  
    public List<Node<T>> getAllNodes(){  
        List<Node<T>> list = new ArrayList<Node<T>>();  
        for(int i=0;i<this.size;i++){  
            if(this.nodes[i] != null){  
                list.add((Node<T>)nodes[i]);  
            }  
        }  
        return list;  
    }
    //获取树的深度，只有根节点时为1  
    @SuppressWarnings("unchecked")  
    public int getDepth(){  
          
        int max = 1;  
        if(this.nodes[0] == null){  
            return 0;  
        }  
          
        for(int i=0;i<this.count;i++){  
            int deep = 1;  
            int location = ((Node<T>)(this.nodes[i])).getParent();  
            while(location != -1 && this.nodes[location] != null){  
                location = ((Node<T>)(this.nodes[location])).getParent();  
                deep++;  
            }  
            if(max < deep){  
                max = deep;  
            }  
        }  
        return max;  
    }
}
