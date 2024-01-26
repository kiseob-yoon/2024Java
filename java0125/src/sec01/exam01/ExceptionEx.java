package sec01.exam01;

class MyClass2 { //예외 발생 메소드 만들어 놓고 main에서 무조건 사용하게끔 한다.
	void method() throws MyExcption {
		throw new MyExcption("너의 예외 상황");
	}
}

public class ExceptionEx {

	public static void main(String[] args) {
		MyClass2 myClass  = new MyClass2();
		try {
			myClass.method();
		} catch (MyExcption e) {
			e.printStackTrace();
		}

	}

}
