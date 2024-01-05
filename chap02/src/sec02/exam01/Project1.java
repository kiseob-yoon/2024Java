package sec02.exam01;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int balance = 0;
		boolean run = true;
		Login login = new Login();

		
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.회원가입 | 2.로그인 | 3.예금/출금 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			int menuNum = scanner.nextInt();
		
			if(menuNum == 1) {
				scanner.nextLine();
				System.out.print("1. 이름: ");
				login.info1 = scanner.nextLine();
				System.out.print("2. 주민번호 앞 6자리: ");
				login.info2 = scanner.nextInt();
				scanner.nextLine();
				System.out.print("3. 전화번호: ");
				login.info3 = scanner.nextLine();
				System.out.println("회원가입 되었습니다.");
				login.success = true;
				continue;


			} else if(menuNum == 2 && login.success) {
				if (login.info1.equals("java")) {
					if (login.info2 == 950522) {
						if(login.info3.equals("010-6311-4157")) {
							System.out.println("회원가입 성공");
							continue;
						}
					} 
				
				System.out.println("로그인 처리");
				scanner.nextLine();
				System.out.print("아이디:");  //출력문
				login.name = scanner.nextLine(); // name 변수의 값 입력
				System.out.print("패스워드:");
				login.strPassword = scanner.nextInt();//패스워드입력
		
				if (login.name.equals("java")) {
					if (login.strPassword == 12345) {
						System.out.println("로그인 성공");
						continue;
					} else {
						System.out.println("로그인 실패:패스워드가 틀림");
					}
				} else {
					System.out.println("로그인 실패:아이디 존재하지 않음");
				}
			}
				else if(menuNum == 3 && login.success) {
				if (login.name.equals("java")) {
					if (login.strPassword == 12345) {
						System.out.print("예금액> ");
						int deposit = scanner.nextInt();
						balance += deposit;
						System.out.print("출금액> ");
						int withdraw = scanner.nextInt();
						balance -= withdraw;
						System.out.println("예금 출금");
						System.out.println("잔액:" + balance);
						continue;
					}
			} 
				}
				else if(menuNum ==4) {
				break;
			} else {
				System.out.println("잘못된 값을 입력하셨습니다.");
			}
		}
			
	System.out.println("로그인이 필요합니다.");
	}
		System.out.println("프로그램 종료");	
}
}



