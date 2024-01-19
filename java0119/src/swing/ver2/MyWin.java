package swing.ver2;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyWin extends JFrame{
	JLabel lb1 = new JLabel("이름1");
	JButton bt1 = new JButton("버튼1");
	JTextField tf1 = new JTextField(5);
	
	JLabel lb2 = new JLabel("이름2");
	JButton bt2 = new JButton("버튼2");
	JTextField tf2 = new JTextField(5);
	
	
	public MyWin(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout()); //반응형 웹의 기능을 한다.
		con.add(lb1);
		con.add(tf1);
		con.add(bt1);
		
		con.add(lb2);
		con.add(tf2);
		con.add(bt2);

		this.setSize(400,300);
		this.setLocation(500, 500);
		this.setVisible(true);
		this.setTitle("MyWindow");
		
	}
	
	
	public static void main(String[] args) {
		new MyWin();

	}

}
