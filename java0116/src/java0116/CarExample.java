package java0116;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-50); //스피드를 -50으로 변경할려고 시도하지만 0으로 반영
		
		System.out.println("현재 속도: " + myCar.getSpeed()); //
		
		myCar.setSpeed(60); //정상 스피드 적용
		
		if(!myCar.isStop()) { //자동차가 멈추지 않는다면(작동중이라면)
			myCar.setStop(true); //작동을 멈추고 스피드 0
		}
		
		System.out.println("현재 속도: " + myCar.getSpeed());
	}

}
