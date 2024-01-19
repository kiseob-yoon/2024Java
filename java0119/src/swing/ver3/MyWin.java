package swing.ver3;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyWin extends JFrame implements ActionListener{
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
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
	}
	
	//JLabel(메뉴명), JButton(버튼), JTextFiled(빈칸)
	//Size(크기), location(위치), Visible(창띄우기), Title(제목)
	//Container클래스의 getContentPane은 컴포넌트를 담는 역할
	//add(추가)
	//addActionListener는 버튼에 이벤트 추가 implements로 ActionListener인터페이스를 선언해줘야 사용가능
	
	
	public static void main(String[] args) {
		new MyWin();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("클릭!");
		if(e.getSource().equals(bt1)) { //e.getSource
			System.out.println("버튼1");
		} else if(e.getSource().equals(bt2)) {
			System.out.println("버튼2");
		}
	}

}
