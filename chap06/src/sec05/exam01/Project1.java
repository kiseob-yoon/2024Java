package sec05.exam01;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		Account []acc = new Account[2]; 
		boolean run2 = true;
		boolean loginStatus = false;
		int idx = -1;
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				System.out.print("아이디:");
				String id = scanner.nextLine();
				System.out.print("비밀번호:");
				String password = scanner.nextLine();
				for(int i = 0; i <acc.length; i++) {
					if(id.equals(acc[i].name)) {
						if(password.equals(acc[i].ssn)) {
							System.out.println("로그인 성공");
							idx++; // idx(2)
						} else {
							System.out.println("로그인 실패!");
						}
					}
				}
				break;
			case 2:
				System.out.println("회원 가입");
				for(int i = 0; i <acc.length; i++) {
				System.out.print("이름:");
				String name = scanner.nextLine();
				System.out.print("생년월일:");
				String ssn = scanner.nextLine();
				System.out.print("전화번호:");
				String tel = scanner.nextLine();
				acc[i] = new Account(name, ssn, tel);
				System.out.println(acc[i]);
				}
			
				break;
			case 3:
				if (idx==0) {  // 로그인 여부
					run2 = true; // 조건식 참이면 true 대입
				} else { // 
					System.out.println("로그인 하시기 바랍니다.");
					continue;
				}
				while(run2) {
					System.out.println("-------------------------------------");
					System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
					System.out.println("-------------------------------------");
					System.out.print("선택> ");
					int menuNum2 = Integer.parseInt(scanner.nextLine());
					switch (menuNum2) {
					
					case 1:
						System.out.print("예금액> ");
						acc[idx].balance += Integer.parseInt(scanner.nextLine());
						break;
					case 2:
						System.out.print("출금액> ");
						acc[idx].balance -= Integer.parseInt(scanner.nextLine());
						break;
					case 3:
						System.out.print("잔고> ");
						System.out.println(acc[idx].balance);
						break;
					case 4:
						run2 = false;
						break;
					}
					System.out.println();
				
				}
				break;
			case 4:
				run = false;
				break;
			}

		}
		System.out.println("프로그램 종료");
	}
	
}
