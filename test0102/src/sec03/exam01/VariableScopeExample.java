package sec03.exam01;

public class VariableScopeExample {
	public static void main(String[]args) {
		int v1 = 15; //v1 전역변수
		if(v1>10) {
			int v2; // v2 지역변수(중괄호 안에있는 녀석들만 이 변수를 사용할 수 있음)
			v2 = v1 - 10;
		}
		//int v3 = v1 + v2 + 5;
	}
}
