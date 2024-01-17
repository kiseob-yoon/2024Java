package sec02.exam02;

public class ChildEx {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; //부모 클래스는 자식 클래스를 담을 수 있다.
		parent.method1(); //부모 객체 구문 출력
		parent.method2(); //오버라이딩 자식 객체 구문 출력
//		parent.method3(); //부모 객체에 생성이 안되어 있어 출력 불가능
	}

}
