package sec02.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5); //메소드 호출 인수 값 전달
		
//		boolean gasState = myCar.isLeftGas();
//		if(gasState) {
//			System.out.println("출발합니다.");
//			myCar.run();
//		}
		
		while(myCar.isLeftGas()) { //가스 있으면 true반환 받음
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		
//		if(myCar.isLeftGas()) {
//			System.out.println("gas를 주입할 필요가 없습니다.");
//		} else {
//			System.out.println("gas를 주입하세요.");
//		}
	}

}
