package sec04.exam01;

public class Cal {
	static int sx; //객체 생성과 상관없이 사용하는 것 static은 메모리 한 곳에 올라감
	int x; //객체마다 힙영역에 생기는 것
	
	void power() { // static 사용 x
		System.out.println("전원을 켭니다.");
		System.err.println("sx:" + sx);
	}
	void printX() {
		System.out.println(x);
	}
}
