package swing.ver1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame1 extends JFrame implements ActionListener{
	JButton jb1 = new JButton("output");
	JButton jb2 = new JButton("input");
	JTextField jt1 = new JTextField();
	JTextField jt2 = new JTextField();
	JLabel lb1 = new JLabel("이름");
	JLabel lb2 = new JLabel("아이디");
	
	public MyFrame1() {
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(null);
		this.setVisible(true); 
		this.setSize(500, 500); 
		this.setLocation(400,400); 
		this.setTitle("window창 띄우기"); 
		
		con.add(jt1);
		jt1.setLocation(50, 50);
		jt1.setSize(100, 30);
		
		JLabel lb1 = new JLabel("이름");
		con.add(lb1);
		lb1.setLocation(20, 50);
		lb1.setSize(100, 30);
		
		con.add(jt2);
		jt2.setLocation(250, 50);
		jt2.setSize(100, 30);
		
		JLabel lb2 = new JLabel("아이디");
		con.add(lb2);
		lb2.setLocation(200, 50);
		lb2.setSize(100, 30);
		
		jb1.setLocation(20, 350);
		jb1.setSize(100, 30);
		con.add(jb1);
		
		jb2.setLocation(200, 350);
		jb2.setSize(100, 30);
		con.add(jb2);
		
	}

	public static void main(String[] args) {
		new MyFrame1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("클릭!");
	}

}
