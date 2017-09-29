package com.qing.tree;

public class Client {

	public static void main(String[] args) {
		
		Node<String> root=new Node<String>("A",-1);
		Tree<String> tree=new Tree<String>(root, 10);
		Node<String> b = new Node<String>("B",0);  
        Node<String> c = new Node<String>("C",0);  
        Node<String> d = new Node<String>("D",1);
        
        tree.addNode(b);
        tree.addNode(c);
        tree.addNode(d);
        
        for(int i=0;i<tree.getAllNodes().size();i++){
        	Node<String> n = tree.getAllNodes().get(i);
            System.out.println(n.getData()+" <- "+n.getParent());
        }
		
	}

}
