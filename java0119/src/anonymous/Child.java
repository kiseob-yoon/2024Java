package anonymous;

class Parent{
	void method(){}
}
public class Child extends Parent{
	
	@Override
	void method() {
		super.method();
	}

	public static void main(String[]ar) {
		new Child(); // 익명 객체(변수가 없음): 다시 부를 수 없음
		
		new Parent() { //익명 자식 객체
			@Override
			void method() { //부모 객체를 재정의
				super.method();
				
			}
			
		};
	}
}
