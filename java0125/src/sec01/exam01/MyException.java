package sec01.exam01;

public class MyException extends RuntimeException{
	public MyException(String msg) {
		super(msg);
	}
}

//RuntimeException 실행 예외는 컴파일러가 체크를 하지 않기 때문에 명시적인 예외처리 불필요 