package sec02.exam02;

class AnyClass2{
	void anyMethod() throws Exception{ //throws 메소드에서 처리하지 못한 예외를 떠넘기는 방법이다.
		throw new Exception(); //예외 발생시키는 것
	} 

}

public class Ex2 {

	public static void main(String[] args){ //메서드, 예외 발생시키는 것, catch 3개가 연동되어 같은 에러명을 달고 다닌다.
		AnyClass2 anyClass = new AnyClass2();
		try {
			anyClass.anyMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
