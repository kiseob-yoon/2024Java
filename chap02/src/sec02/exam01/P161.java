package sec02.exam01;

import java.util.Scanner;

public class P161 {

	public static void main(String[] args) {
		//예금 조회 프로그램 작성하기
		boolean run = true;
		int balance = 0;

		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------------");
			System.out.print("선택> ");
			
			int pressnumber = scanner.nextInt();
			
			if(pressnumber == 1) {
				System.out.print("예금액> ");
				int deposit = scanner.nextInt();
				balance += deposit;   
			} else if(pressnumber == 2) {
				System.out.print("출금액> ");
				int withdraw = scanner.nextInt();
				balance -= withdraw;
			} else if(pressnumber ==3) {
				System.out.println(balance);
			} else if(pressnumber ==4) {
				break;
			} else {
				System.out.println("잘못된 값을 입력하셨습니다.");
			}
		
			
		}
		System.out.println("프로그램 종료");
	}

}
