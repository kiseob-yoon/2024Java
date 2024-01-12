package sec05.exam01;

public class Circle2 {
	int radius; //저장 역할
	
	public Circle2(int radius) { //생성자는 객체생성과 동시에 초기화 역할
		this.radius = radius;
	}
	public void set(int radius) { //메소드는 동작 역할 
		this.radius = radius;
	}

	public static void main(String[] args) {
		Circle2 cir1 = new Circle2(2); 
		System.out.println(cir1.radius);
		Circle2 cir2 = cir1; //위치 정보만 공유
		cir1.set(4);
		System.out.println(cir1.radius);
		cir1.set(5);
		System.out.println(cir1.radius);
		cir1.set(6);
		System.out.println(cir1.radius);
		
	}

}
