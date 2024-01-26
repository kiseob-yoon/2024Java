package page417;

public class Button { //버튼 객체
	OnClickListener listener; //인터페이스 타입의 멤버 변수
	
	void setOnClickListener(OnClickListener listener) { //setter(값을 받는 역할)
		this.listener = listener; //이벤트 처리하는 리스너 역할
	}
	
	void touch() { //버튼을 터치했을 때 등록된 인터페이스의 onClick메서드 호출
		listener.onClick();
	}
	static interface OnClickListener{
		void onClick();
	}

}
