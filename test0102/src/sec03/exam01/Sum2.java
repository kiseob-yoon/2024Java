package sec03.exam01;

import java.util.Scanner;

public class Sum2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 입력을 위한 준비
		
		int sum = 0;
		
		System.out.print("첫 번째 숫자를 입력하세요:"); //처리(UI)
		int num1 = scanner.nextInt(); //입력
		System.out.print("두 번째 숫자를 입력하세요:"); //처리(UI)
		int num2 = scanner.nextInt(); //입력
		System.out.printf("num1: %d, num2: %d\n",num1,num2);
		
		for(int i = num1; i <= num2; i++) { //입력값과 조건을 모두 입력받아 처리
		sum += i;
		}
		System.out.printf("합계: %d\n", sum); //출력
	}
}
