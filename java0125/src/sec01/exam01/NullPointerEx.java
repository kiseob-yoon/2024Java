package sec01.exam01;

class MyClass{
	void method() {}
}

public class NullPointerEx {

	public static void main(String[] args) {
		MyClass myClass = null; //메모리 영역에 변수만 올라가고 힙영역에 객체가 없다.
		myClass.method();
		
		String data = null;
		System.out.println(data.toString());
	}

}
