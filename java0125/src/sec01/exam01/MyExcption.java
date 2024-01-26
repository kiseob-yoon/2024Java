package sec01.exam01;

public class MyExcption extends Exception{ 
	public MyExcption(String msg) { //생성자를 통해 예외 메시지를 설정
		super(msg); //부모 클래스인 Exception 클래스의 생성자를 호출하여 예외 메시지 설정
	}
}

