package sec02.exam02;

class AnyClass{
	void anyMethod() throws Exception {} //throws 메소드에서 처리하지 못한 예외를 떠넘기는 방법이다.
	void method() {
		try {
			this.anyMethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Ex {

	public static void main(String[] args){
		AnyClass anyClass = new AnyClass();
		anyClass.method();
	}

}
