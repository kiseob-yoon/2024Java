package sec02.exam05;

public class ChildEx {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data";
//		parent.field2 = "data"; //접근불가
		parent.method1();
		parent.method2();
//		parent.method3(); //접근 불가

		Child child = (Child)parent; //다운 캐스팅(문법상의 오류 없음)
		child.field2 = "200";
		
		
		
		
		child.method3();

	}

}
