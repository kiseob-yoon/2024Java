package sec03.exam01;

public class VariableExchangeExample {
	public static void main(String[]args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" +y);
		
		int temp = x; // x를 temp 변수에 담아둠
		x = y; // y값을 x에 대입-> x는 y값을 받아서 5가된다
		y = temp; // temp에 대입했던 x의 값을 y에 대입 y는 3이된다
		System.out.println("x:" + x + ", y:" +y);
		
		//자료교환(swap)
	}
}
