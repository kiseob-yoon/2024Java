package page416;

public class Outter {
	static String str = "static-str"; //1출력
	String field = "Outter-field"; //3출력
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested{
		String field = "Nested-field"; //2출력
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(Outter.str);
			System.out.println(this.field);
			System.out.println(Outter.this.field); 
		}
	}
	
	
}
