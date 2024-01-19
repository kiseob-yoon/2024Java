package swing.ver5;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyWin extends JFrame {
	JLabel lb1 = new JLabel("이름1");
	JButton bt1 = new JButton("버튼1");
	JTextField tf1 = new JTextField(5);

	JLabel lb2 = new JLabel("이름2");
	JButton bt2 = new JButton("종료");
	JTextField tf2 = new JTextField(5);

	public MyWin() {
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout()); // 반응형 웹의 기능을 한다.
		con.add(lb1);
		con.add(tf1);
		con.add(bt1);

		con.add(lb2);
		con.add(tf2);
		con.add(bt2);

		this.setSize(400, 300);
		this.setLocation(500, 500);
		this.setVisible(true);
		this.setTitle("MyWindow");

		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1");
			}
		});

		bt2.addActionListener(new ActionListener() { // 익명 객체(일회성)활용 즉시성이 장점이고 자기이외에 것은 접근이 불가하고 if문 안써도됨

			@Override
			public void actionPerformed(ActionEvent e) {
				confirmExit();
			}
		});
		// 파일읽기 작업 처리 // 모달창 앞에 창을 처리를 해야 뒤에있는 것을 접근 가능
		JOptionPane.showMessageDialog(this, "파일을 읽었습니다!","파일읽기",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void confirmExit() {
		int answer = JOptionPane.showConfirmDialog(this, "종료하시겠습니까?",
										  "confirm",JOptionPane.YES_NO_OPTION);
		if(answer ==JOptionPane.YES_OPTION) {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		} else {
			System.out.println("종료를 취소합니다.");
		}
	}
	public static void main(String[] args) {
		new MyWin();
		

	}

}
