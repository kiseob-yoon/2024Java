package sec02.exam01;

public class AnonyEx {

	public static void main(String[] args) {
		Anonymous anonymous = new Anonymous();
		anonymous.field.wake();
		anonymous.method1();
		
		anonymous.method2(new Person(){
			void study() {
				System.out.println("공부");
			}
			@Override
			void wake() {
				System.out.println("8시에 일어난다.");
				study();
			}
			
		});

	}

}
