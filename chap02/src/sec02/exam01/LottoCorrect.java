package sec02.exam01;

import java.util.Random;
import java.util.Scanner;

public class LottoCorrect {

	public static void main(String[] args) {
		// 메소드를 이용한 난수 곱셈
		for(int i=0; i < 3; i++) {
			multiplication();
		}
		System.out.println("종료");
	}
	
	public static int createNumber(Random random) { //createNumber 메소드 선언/Random 타입의 random 객체를 받음
//		Random random = new Random();
		return random.nextInt(10)+1; //random변수를 닷(.)으로 참조값 접근하여 난수 넣어주고 이를 외부에 반환
 
	}
	
	public static void multiplication() {
		Random random = new Random(); //객체 생성
		Scanner scan = new Scanner(System.in);
		
		int num1 = createNumber(random); //메서드 호출 random 객체의 값 반환받아 num1 변수에 대입
		int num2 = createNumber(random); //메서드 호출 random 객체의 값 반환받아 num2 변수에 대입
		int multi = num1 * num2; 
		System.out.printf("%d X %d = ?\n", num1, num2);
		for(;;) {
			System.out.println("입력>");
			int answer = scan.nextInt();
//			int answer = Integer.parseInt(scan.nextLine());
			if(answer == multi) {
				System.out.println("정답입니다.");
				break;
			} else {
				System.out.println("오답입니다.");
			}
		}
		
	}

}
