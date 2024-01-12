package sec02.exam03;

public class Calculator {
	private int plus(int x, int y) { //private으로 외부 호출을 막음
		int result = x + y;
		return result;
	}
	double avg(int x, int y) { //접근 제한자 안붙으면 defalut
		double sum = this.plus(x, y); //내부 호출
		double result = sum /2;
		return result;
	}
	void execute() { // 외부 외출
		double result = this.avg(7,10);
		this.println("실행결과: " + result); //내부 회출
	}
	void println(String message) { 
		System.out.println(message);
	}

}

//내부에서 this.으로 호출이 가능함
//내부 호출의 목적은 재사용과 코드 유지보수