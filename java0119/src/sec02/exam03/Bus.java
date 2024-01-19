package sec02.exam03;

public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스 달린다.");
	}
	
	public void checkFace() {
		System.out.println("승차 요금을 체크합니다.");
	}

}
