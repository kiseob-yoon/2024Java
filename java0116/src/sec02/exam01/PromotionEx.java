package sec02.exam01;

class A{}

class B extends A{}
class C extends A{}

class D extends B{}
class E extends C{}

public class PromotionEx {
	public static void main(String[] args) {
//		Object obj = new A(); //Object는 최상위 클래스라서 어떤 클래스도 받아낼 수 있다. 웹 서비스에 간혹 사용된다.
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b; //부모 클래스로 변수를 선언하고, 자식 클래스의 객체를 참조할 수 있다.
		A a2 = c; 
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
//		B b3 = e; //상속 관계가 아님
//		C c2 = d;//상속 관계가 아님
	}

}
