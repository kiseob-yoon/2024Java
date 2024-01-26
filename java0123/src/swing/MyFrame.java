package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;



public class MyFrame extends JFrame{
	class MyEvent implements ActionListener{
		String str; //방법 2(생성자) 

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(tf.getText()); //텍스트 필드에 입력받은 값을 출력
		}
		
	}
	String str = "안녕";
//	static String str = "안녕"; //방법 1(static)
	JTextField tf = new JTextField(10);//텍스트 입력을 받을 수 있는 텍스트 필드 생성
	JButton bt = new JButton("실행");
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		this.setLocation(500,400);
		this.setSize(400,300);
		this.setVisible(true);
		con.add(tf); con.add(bt);
		bt.addActionListener(new MyEvent());
	}
	
	public static void main(String[]arge) {
		new MyFrame();
	}

}
