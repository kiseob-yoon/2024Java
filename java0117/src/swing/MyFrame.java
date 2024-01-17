package swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	public MyFrame() {
		Container con = this.getContentPane();
		con.setLayout(null);
		JButton jc1 = new JButton("전체내용"); //버튼 생성
		jc1.setLocation(20, 800);
		jc1.setSize(100, 35);
		con.add(jc1);
		
		JButton jc2 = new JButton("입력"); //버튼 생성
		jc2.setLocation(220, 800);
		jc2.setSize(100, 35);
		con.add(jc2);
		
		JButton jc3 = new JButton("조회"); //버튼 생성
		jc3.setLocation(420, 800);
		jc3.setSize(100, 35);
		con.add(jc3);
		
		JButton jc4 = new JButton("수정"); //버튼 생성
		jc4.setLocation(620, 800);
		jc4.setSize(100, 35);
		con.add(jc4);
		
		JButton jc5 = new JButton("삭제"); //버튼 생성
		jc5.setLocation(820, 800);
		jc5.setSize(100, 35);
		con.add(jc5);
		
		JLabel jb2 = new JLabel("이름"); //글자 출력
		jb2.setLocation(20, 20); 
		jb2.setSize(100, 35);
		con.add(jb2);
		
		JLabel jb3 = new JLabel("아이디"); //글자 출력
		jb3.setLocation(220, 20); //60간격
		jb3.setSize(100, 35);
		con.add(jb3);
		
		JLabel jb4 = new JLabel("패스워드"); //글자 출력
		jb4.setLocation(420, 20); //60간격
		jb4.setSize(100, 35);
		con.add(jb4);
		
		JLabel jb5 = new JLabel("생년월일"); //글자 출력
		jb5.setLocation(620, 20); //60간격
		jb5.setSize(100, 35);
		con.add(jb5);
		
		JLabel jb6 = new JLabel("전화"); //글자 출력
		jb6.setLocation(820, 20); //60간격
		jb6.setSize(100, 35);
		con.add(jb6);
		
		JLabel jb7 = new JLabel("잔고"); //글자 출력
		jb7.setLocation(1020, 20); //60간격
		jb7.setSize(100, 35);
		con.add(jb7);
		
		JTextField jt1 = new JTextField(""); //글자 직접 입력할 수 있음
		jt1.setLocation(80, 20);
		jt1.setSize(100, 35);
		con.add(jt1);
		
		JTextField jt2 = new JTextField(""); //글자 직접 입력할 수 있음
		jt2.setLocation(280, 20);
		jt2.setSize(100, 35);
		con.add(jt2);
		
		JTextField jt3 = new JTextField(""); //글자 직접 입력할 수 있음
		jt3.setLocation(480, 20);
		jt3.setSize(100, 35);
		con.add(jt3);
		
		JTextField jt4 = new JTextField(""); //글자 직접 입력할 수 있음
		jt4.setLocation(680, 20);
		jt4.setSize(100, 35);
		con.add(jt4);
		
		JTextField jt5 = new JTextField(""); //글자 직접 입력할 수 있음
		jt5.setLocation(880, 20);
		jt5.setSize(100, 35);
		con.add(jt5);
		
		JTextField jt6 = new JTextField(""); //글자 직접 입력할 수 있음
		jt6.setLocation(1080, 20);
		jt6.setSize(100, 35);
		con.add(jt6);
		
		JTextArea ta = new JTextArea();
		ta.setLocation(20, 120);
		ta.setSize(830, 200);
		con.add(ta);
		
		this.setLocation(200, 100);
		this.setTitle("스윙 연습");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //메모리 보존
		this.setSize(800,800); //크기 설정
		this.setVisible(true); //윈도우 프레임을 보이게
	}
	public static void main(String[] args) {
		new MyFrame();
		
	}

}
