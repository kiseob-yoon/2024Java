package sec03.exam01;

public class variableEx {

	public static void main(String[] args) {
		int v1 = 0;
		if(true) {
			int v2 = 0;
			if(true) {
				int v3 = 0;
				v1 = 1;
				v2 = 1;
				v3 = 1;
			}
			//v1 = v2 + v3; //중괄호안에 v3 변수가 선언되어있지 않음.
		}
		System.out.println(v1);

	}

}
