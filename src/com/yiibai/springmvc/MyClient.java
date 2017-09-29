package com.yiibai.springmvc;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class MyClient extends JFrame{ 
	private PrintWriter writer;
	Socket socket;
	private JTextArea ta=new JTextArea();
	private JTextField tf=new JTextField();
	Container cc;
	
	public MyClient(String title){
		super(title);
		cc=this.getContentPane();
		cc.add(ta,"North");
		cc.add(tf,"South");
		tf.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				writer.println(tf.getText());
				ta.append(tf.getText()+"\n");
				tf.setText("");
			}
			
		});
	}
	
	private void connect(){
		ta.append("尝试连接\n");
		try {
			socket=new Socket("192.168.1.10",8998);
			writer=new PrintWriter(socket.getOutputStream(),true);
			ta.append("完成链接\n");
			InetAddress netAddress=socket.getInetAddress();
			System.out.println("远程服务器ip:"+netAddress.getHostAddress());
			System.out.println("远程服务器端口:"+socket.getPort());
			InetAddress localAddress=socket.getLocalAddress();
			System.out.println("客户端ip:"+localAddress.getHostAddress());
			System.out.println("客户端端口:"+socket.getLocalPort());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		MyClient client=new MyClient("向客户端发送数据");
		client.setBounds(300, 260, 340, 220);
		client.setVisible(true);
		client.connect();
	}

}
