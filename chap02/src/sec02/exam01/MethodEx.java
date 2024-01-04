package sec02.exam01;

public class MethodEx {

	public static void main(String[] args) {
		method(100,300); // 메서드 호출
		int ret = method2(300,400); //method2 호출 매개변수 300,400넣고 return으로 반환된 연산식을 ret에 받아옴
		System.out.println(ret); // ret출력
	}
	
		
	public static int method2(int x, int y) { //메서드 타입이 있으면 return한 값을 돌려줌
		return x+y;
	}
	
	public static void method(int x, int y) { //메서드 정의 void는 단독실행
		System.out.println(x+y);

	}

}
