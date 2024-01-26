package page416;


public class Ex {

	public static void main(String[] args) {
		Outter outter = new Outter(); //outter 변수는 생성된 Outter 클래스의 인스턴스를 참조
		Outter.Nested nested = outter.new Nested(); //outter.new Nested()는 outter 인스턴스를 통해 Nested 클래스의 새로운 인스턴스를 생성하는 문법
		nested.print();
	}

}
