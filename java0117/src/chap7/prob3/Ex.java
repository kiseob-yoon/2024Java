package chap7.prob3;

public class Ex {
	
	public static void method(B b) {
		
	}
	
	public static void main(String[] args) {
		method(new B()); //객체 생성과 동시에 method 호출
//		B b = (B) new A(); //자식 변수에 부모 객체를 다운캐스팅해서 만들려고 시도
		
//		B b2 = (B) new A();
		
		A a = new A(); 
		if(a instanceof B) { //A타입의 a가 B로 안전하게 캐스팅 될 수 있는지 확인
			B b = (B) a;
			System.out.println("변환 가능");
		} else {
			System.out.println("변환 불가능");
		}

	}

}
//1. A타입의 객체 생성 
//2. 객체를 생성할때 A로 생성했기 때문에 B타입으로 강제 캐스팅 불가
//3. 다운캐스팅을 원하면 new B를 생성해서 다운캐스팅하면 됨
