package sec02.exam01;

public class CarEx {

	public static void main(String[] args) {
		//String str; 메인 메서드가 끝나면 사용 못하기에 지역변수
		
	
		Car car3 = new Car("현대자동차","제네시스G80","red",300); 
		System.out.println(car3);
		
		Car car2 = new Car("monkey"); //인자값 없이 하면 컴파일러가 기본 생성자 자동 생성, 클래스에서 생성자에 인수를 쓰면 기본 생성자 지원 x
		System.out.println(car2); 
		
		Car car = new Car(); 
		car.company ="현대자동차";
		car.color = "black";
		car.model = "그렌져";
		car.maxSpeed = 250;
		
		System.out.println(car);
		
	}

}

//지역변수는 초기화해주어야 하고 객체를 생성하면 초기값이 할당된다