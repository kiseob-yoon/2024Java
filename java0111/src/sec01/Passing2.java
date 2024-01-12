package sec01;

class YourClass{
	int x;
}

public class Passing2 {

	public static void main(String[] args) {
//		YourClass yc3 =null;
//		yc3.x = 200;
		
		YourClass yc = new YourClass(); // 객체 생성(기본생성자 실행)
//		System.out.println("main:" + yc);	
		System.out.println("main:" + yc.x);	
		method(yc);
		System.out.println("main:" + yc.x);
		
//		YourClass yc1 = new YourClass(); // 객체 생성(기본생성자 실행)
//		System.out.println("다른 객체:" + yc1);
	}
	
	public static void method(YourClass yc) { //넘겨준 애가 객체의 주소를 넘겨줘서 필드에 접근할 수 있었음 
//		System.out.println("method1:" + yc);
		yc.x = 300; 
		return;
	}

}

