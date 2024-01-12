package sec01;

public class Passing1 {
	
	public static int method1(int y) { //함수, 메소드
		return y * 5; //y도 지역변수(단, 호출한 곳에서 값을 넘겨 줘야 한다.) 호출 시 리턴
	}
	
	public static void main(String[] args) {
		int x= 100; //x라는 지역변수(지역변수는 그 블럭(중괄호)내에서만 생존한다.)
		int num = method1(x); //반환값 있는 메서드 호출하면 무조건 return값 받게 된다. 따라서 return받은 값을 num이라는 변수에 대입함
		System.out.println("ReturnValue:" + num); 
		System.out.println("x값:" + x);
	}

}
