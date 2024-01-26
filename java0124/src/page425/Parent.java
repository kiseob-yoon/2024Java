package page425;

public class Parent {
	void parentMethod() {};
}
class Child extends Parent{
	
}

class A {
	void method1(Parent p) {} //Parent타입의 매개변수를 받음
	
	void method2() { //
		this.method1(new Parent() { //method1은 같은 클래스 소속으로 호출 가능
			@Override //Parent 클래스의 자식 
			void parentMethod() {
				super.parentMethod();
			}
			
		});
	}
	
	Parent field = new Parent() { 
		@Override //자식 객체이니 오버라이딩 된다.
		void parentMethod() {
			super.parentMethod();
		}
		
	};
	
	void method() {
		Parent var = new Parent() {
			@Override //Parent 클래스의 자식
			void parentMethod() {
				super.parentMethod();
			}
			
		};
	}
}
