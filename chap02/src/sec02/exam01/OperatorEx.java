package sec02.exam01;

public class OperatorEx {
	public static void main(String[]args) {
		String str = "JDK" + (3 + 3.0);
		System.out.println(str);
		
		for(int i = 0; i < 10; i++) {
			char c1 = (char)('A' + i);
			System.out.print(c1 + ", ");
		}
		System.out.println();
		

		
		for(int i= 2; i < 10; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
		
		boolean play = true;
		System.out.println(play);
		System.out.println(!play);
		
		int x = 1;
		int y = 1;
		int result1 = ++x + 10; //12 x를 증가시킨 다음에 계산
		System.out.println(result1);
		int result2 = y++ + 10; //11 y를 증가시키지 않은 상태로 계산
		System.out.println(result2);
		System.out.println("x:" + x + " y:" + y);
		
		byte b = 100;
//		byte reslt = -b; // -1  b(연산 결과가 정수)
	}
}
