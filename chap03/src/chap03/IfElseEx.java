package chap03;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오:");
		int score = scanner.nextInt();
		score = score/10;
		
	
		switch(score) {
		case 10: //공통된 구문 출력하려면 case 나란히 2개사용
		case 9:
			System.out.println("A"); 
			break; //break문은 switch문을 빠져나감
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
			break;
		}
		
		
		
//		
//		if(score <= 100 && score >=0) {
//		
//		if(score>=90 && score <=100) {
//			System.out.println("점수가 100~90점입니다.");
//			System.out.println("등급은 A등급입니다.");
//		} else if(score>=80) {
//			System.out.println("점수가 80~89입니다");
//			System.out.println("등급은 B등급입니다.");
//		} else if(score>=70) {
//			System.out.println("점수가 70~79점입니다.");
//			System.out.println("등급은 c입니다.");
//		} else{
//			System.out.println("점수가 70미만입니다.");
//			System.out.println("등급은 D입니다.");
//		}
//
//	} else {
//		System.out.println("점수 오류");
//	}
	}

}
