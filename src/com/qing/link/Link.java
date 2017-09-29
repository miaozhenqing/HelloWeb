package com.qing.link;

public class Link {
	Node head=null;
	
	public Node getHead() {
		return head;
	}

	//插入数据
	public void addNode(int data){
		if(head!=null){
			Node temp=head;
			while(temp.getNext()!=null){
				temp=temp.getNext();
			}
			temp.setNext(new Node(data));
		}else{
			head=new Node(data);
		}
	}
	//返回长度
	public int getLength(){
		int length=0;
		while(head!=null){
			head=head.getNext();
			length+=1;
		}
		return length;
	}
}
