package page417;

import java.util.Scanner;

public class ButtonEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Button btn = new Button();
		Button.OnClickListener listener = null;
		System.out.println("선택(1:전화, 2:메시지):");
		String str = scanner.nextLine();
		switch(str) {
		case "1":
			listener = new CallListener();
			break;
		case "2":
			listener = new MessageLisenner();
			break;
		default:
			System.out.println("다시 선택해주세요");
		}
		btn.setOnClickListener(listener);
		btn.touch();


	}

}

//번호에 따라 전화 or 메시지를 listener에 담기
//btn이라는 버튼 참조값으로 접근하여 setOnClickListener 메서드 호출 인수값으로 전화 or 메시지를 담아둠
//다시 btn에 담은 전화 or메시지를 통해서 오버라이딩된 touch메서드를 호출