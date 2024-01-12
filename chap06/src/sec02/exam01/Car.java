package sec02.exam01;

public class Car {
	String company; //객체의 성격 혹은 property이다. 명칭은 필드라 부르고 지역변수보다 재사용성이 높음
	String model;
	String color;
	int maxSpeed;
	
	public Car() { //기본 생성자, 생성자 이름은 클래스 이름과 같다. 괄호가 있다(메소드니깐), return타입 없어야함. 선언하면 내가 설계한 생성자라고 생각하면 됨
		System.out.println("Car()");
	}
	
	public Car(String str) {
		company = str;
	}
	
	public Car(String str, String str1) {
		company = str;
		model = str1;
	}
	
	public Car(String company, int maxSpeed) {
		this.company = company; //this쓰면 필드를 의미(자기자신)
		this.maxSpeed = maxSpeed;
	}

	public Car(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}
	
}
