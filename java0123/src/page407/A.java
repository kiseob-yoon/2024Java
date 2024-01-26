package page407;

public class A { //클래스 안에 클래스 선언 가능, 스태틱 클래스 선언 가능, 메서드 안에 클래스 선언 가능	
	class B {} //A 클래스의 내부 클래스, 외부 클래스의 인스턴스에 종속(A의 객체를 생성한 후에 B객체를 생성가능)
	static class C {} //독립적인 클래스, A.C와 같이 접근 가능
	void method() { 
		class D {} //메서드 내의 로컬 클래스이다. 메서드 내부에서만 유효함
	}

}
