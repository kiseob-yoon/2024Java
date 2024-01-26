package page413;

public class A {
	public static void main(String[]ar) { //static이 붙으면 A객체 생성과 상관없이 실행이 되기때문에(먼저 생성되고 실행) 객체 A와 상관없음 static이 붙으면 종속성이랑 관계가 없는 것
		B b = new B(); //B클래스가 static이면 소속은 A소속이지만 종속은 되지 않은 것
		b.method();
	}
	int field1;
	void method1() {
		System.out.println("method1()");
	}
	
	static class B { //A의 내부 클래스 
		void method() { //멤버 클래스에 접근 가능(static 붙여도 가능(A클래스 객체 생성이 되지 않아도 이미 메모리에 올라가 있음))
//			field1 = 10;
//			method1();
			System.out.println("method()");
			
//			field2 = 10;
//			method2();
			
		}
	}
	static class C {
		void method() {
//			field1 = 10;
			
		}
	}

	
	
}
