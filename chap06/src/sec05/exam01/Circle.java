package sec05.exam01;

public class Circle {
	int radius;
	String name;

	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public Circle(int radius) {
		this(radius,"원");
	}
		
	public Circle(int radius, String name) { //생성자는 객체 생성과 초기화 동시에
		this.radius = radius;
		this.name = name;
	}
	


	public static void main(String[] args) {
		Circle pizza; //stack영역 생성
		pizza = new Circle(10,"자바피자"); //객체 메모리 할당 및 생성
		double area = pizza.getArea(); //pizza객체변수에서 getArea 메소드 호출해서 area변수에 넘겨줌
		System.out.println(pizza.name + "의 면적은 " + area); //pizza객체변수의 name과 area를 출력 
		
		Circle donut = new Circle(2,"자바도넛");
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " +area);
	}

}
