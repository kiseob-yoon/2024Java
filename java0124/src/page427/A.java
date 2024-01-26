package page427;

class Parent{
	void parentMethod() {}
}

public class A { 
	Parent field = new Parent() { //field는 타입이 Parent이지만 실제로는 Parent클래스를 상속받은 익명 클래스의 인스턴스를 참조한다. 
		int childField;
		void childMethod() {}
	};
	void method() {
		field.parentMethod();
	}
	
}


