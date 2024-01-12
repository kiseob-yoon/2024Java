package sec02.exam03;

class MyClass{
	void method1() { //MyClass와 상관이 있는 메서드
		System.out.println(this.toString());
		System.out.println("method1");
	}
	static void method2() { //MyClass와 상관없는 메서드
		
		System.out.println("method2");
	}
}

public class StaticClass { 
	static void method3() { 
		System.out.println("method3");
	}

	public static void main(String[] args) {
		StaticClass.method3();
		MyClass.method2(); 
		MyClass mc = new MyClass();
		mc.method1();
		mc.method2();
		MyClass mc2 = new MyClass();
		mc2.method1();
		mc2.method2();

	}

}

//staic이 안붙은 것은 객체 생성되면 힙영역에 생성
//static 힙 영역에 생기는 것이 아니라 별도의 공간에 독립적으로 생성되기때문에 메모리 공간을 많이 차지한다. 
//static메소드는 객체를 생성하지 않고 클래스에 접근할 수 있게 한 것이다.
//21, 24, 27라인 메모리 주소 다 똑같음
