package sec05.exam02;

public class ClassName {
	int field1;
	void method1() {}
		static int field2; //사용 가능
		static void method2() {} //사용 가능
	
	
		static void method3() {
			ClassName obj = new ClassName();
			obj.field1 = 10; //즉시 사용 불가능(객체 생성 후 사용 가능)
			field2 = 10; //static애들은 클래스소속으로 메모리에 미리 올라간다(실행 가능한 상태)
			
	}
	void method4() {
		field1 = 10; //this.field
		field2 = 10; //ClassName;
	}

}

//main 메서드는 static메서드이니깐 외부의 필드값을 사용하려면 객체를 생성해서 사용해야 함