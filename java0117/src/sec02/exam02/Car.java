package sec02.exam02;

public class Car {
	Tire frontLeftTire = new Tire(6, "앞왼쪽"); //Tire 클래스 또는 Tire를 상속받은 하위 클래스의 객체를 참조할 수 있습니다. 
	Tire frontRightTire = new Tire(2, "앞오른쪽");
	Tire backLeftTire = new Tire(3, "뒤왼쪽");
	Tire backRightTire = new Tire(4, "뒤오른쪽");
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false){stop(); return 1;}
		if(frontRightTire.roll()==false){stop(); return 2;}
		if(backLeftTire.roll()==false){stop(); return 3;}
		if(backRightTire.roll()==false){stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	
}
