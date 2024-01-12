package sec02.exam03;

public class Car {
	int gas; //값 넘겨받음
	
	void setGas(int gas) { //매개변수로 값 받아옴
		this.gas = gas; //필드에 선언한 변수에 값 넘겨주기
	}
	
	boolean isLeftGas() {
		if(gas ==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -=1;
			} else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				return; //메소드는 return으로 반복문 탈출핤 수 있는데 지금 이 줄에서 실행중단 break는 코드의 끝까지 가는 것
			}
		}
	}

}
