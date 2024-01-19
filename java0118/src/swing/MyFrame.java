package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyAction implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource());
		//acctionPerformed 메서드는 이벤트가 발생했을 떄 호출되는 메서드
		//이 메서드는 이벤트가 발생한 소스를 콘솔에 출력
	}
	
}

public class MyFrame extends JFrame{ //JFrame 클래스를 상속받아 JFram객체 생성
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창 닫기 버튼 설정
		Container con = this.getContentPane(); // 컴포넌트를 담을 컨테이너
		this.setVisible(true); //창을 보이게 설정
		this.setSize(500, 300); //창의 크기 설정
		this.setLocation(300,300); //창의 위치 설정
		this.setTitle("오늘은 이벤트"); //창의 제목 설정
		
		con.setLayout(new FlowLayout()); //레이아웃 매니저를 FlowLayout으로 설정
		JButton jb = new JButton("버튼1"); //버튼1
		con.add(jb); //버튼에 컨테이너 추가
		jb.addActionListener(new MyAction()); //액션 
		JButton jb2 = new JButton("버튼2");//버튼2
		con.add(jb2); //버튼에 컨테이너 추가
		jb2.addActionListener(new MyAction()); //버튼에 이벤트 리스터(MyAction)등록
		
		//JFrame: Java Swing라이브러리에서 제공하는 윈도우(프레임)을 나타내는 클래스. GUI생성
		//GUI: 그래픽으로 표현된 사용자 인터페이스를 의미한다. GUI는 컴포넌트들을 조합하여 전체적인 화면을 구성
		//컴포넌트: GUI에서 화면에 시각적으로 표시되는 기본적인 요소들(ex 버튼, 라벨, 텍스트 필드 기능들의 집합)
		//FlowLayout은 컴포넌트들을 순서대로 배치하는 역할
		//addActionListener: 사용자 액션을 감지하기 위한 이벤트 리스너를 등록할 떄 사용
		
		
		
	}
	
	public static void main(String[]grg) {
		new MyFrame(); // MyFrame 객체를 생성하여 GUI를 실행한다.
	}
}
