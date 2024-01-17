package sec02.exam02;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire(15,"앞왼쪽");
				break;
			case 2:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontRightTire = new KumhoTire(13,"앞왼쪽");
				break;
			case 3:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire(14,"앞왼쪽");
				break;
			case 4:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.backRightTire = new KumhoTire(17,"앞왼쪽");
				break;
			}
			System.out.println("-------------------");
		}

	}

}
