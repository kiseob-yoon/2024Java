package sec02.exam02;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	Button.OnClickListener listener = new Button.OnClickListener() { //OnClickListener가 Button클래스의 중첩 인터페이스이기 떄문에 Button.OnClickListener로 접근
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	Window(){
		button1.setOnClickListener(listener); //Button의 setOnClickListener의 listener이 onClick 메서드를 호출하여 전화를 겁니다가 출력
		button2.setOnClickListener(new Button.OnClickListener() { //익명 구현 객체 생성
			//익명 클래스의 onClick 메서드가 호출되어 메시지를 보냅니다가 출력
			
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
}
