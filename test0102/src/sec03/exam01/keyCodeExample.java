package sec03.exam01;

public class keyCodeExample {

	public static void main(String[] args) throws Exception{
		int keyCode;
		
		for(;;) { //무한루프
		
		System.out.print("입력>");
		keyCode = System.in.read(); //입력값 받기
		System.out.println(keyCode); //입력값 출력
		if(keyCode == 113) { 
			break; 
		}
		
	}
		System.out.println("종료");
	}
	
}