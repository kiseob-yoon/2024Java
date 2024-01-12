package sec05.exam01;

import java.util.Scanner;

public class Project2 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		boolean run2 = true;
		Account[] acc = new Account[3]; //배열의 크기를 생성
		acc[0] = new Account("김하나", "911224", "010-1234-1234"); //배열[0]객체 생성
		acc[1] = new Account("김두울", "921224", "010-1234-1234"); //배열[1]객체 생성
		acc[2] = new Account("김세엣", "931224", "010-1234-1234"); //배열[2]객체 생성
		int idx = -1;
		boolean login = false;
		while (run) { //boolean run = true 상태니깐 종료시까지 계속반복
			System.out.println("-------------------------------------");
			if (login) { //로그인 성공시 false->true
				System.out.println(acc[idx].name + " 고객님으로 로그인 상태입니다.");
			}
			System.out.println("1.로그인 | 2.회원수정 | 3.예금/출금 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> "); //메뉴 번호 입력
			int menuNum = Integer.parseInt(scanner.nextLine()); //번호를 입력받고 변수에 값 넣어줌 
			switch (menuNum) { //switch조건문 받은 번호에 따라 case구문으로 이동
			case 1:
				// 로그인 처리
				System.out.println("로그인 처리");
				System.out.print("아이디: ");
				String id = scanner.nextLine();
				System.out.print("패스워드: ");
				String pass = scanner.nextLine();
				for (int i=0; i < acc.length; i++) { //배열 크기만큼 반복
					if (id.equals(acc[i].name)) {
						if (pass.equals(acc[i].ssn)) {
							System.out.println("로그인 성공!"); //초기화값과 일치하면 로그인 
							idx = i; //배열[0]~[2]번째에서 로그인한대로 넘겨줌 ex) 배열 [1]저장되어있는 회원정보로 로그인하면 1임
							run2 = true; //로그인 성공시 run2 true
							login = true; //로그인 성공시 login true로 바꿈
						} 
					}
				}
				break;
			case 2:
				// 회원 수정
				if (login == true) { //로그인시 접속 가능
					System.out.println("회원 정보 수정");
					System.out.print("이름: ");
					acc[idx].name = scanner.nextLine();
					System.out.print("생년월일: ");
					acc[idx].ssn = scanner.nextLine();
					System.out.print("전화번호: ");
					acc[idx].tel = scanner.nextLine();
//					acc[idx] = new Account(name, ssn, tel); //이름,생년월일,전화번호 입력받아 acc변수에 배정된 배열을의 값에 넘겨줌
					System.out.println(acc[idx]); //넘겨받은 회원정보 출력
				} else {
					System.out.println("로그인 후 회원 정보를 수정하세요."); //로그인 안될 시 출력
				}

//				for (int i=0; i < acc.length; i++) {
//					System.out.print("이름: ");
//					String name = scanner.nextLine();
//					System.out.print("생년월일: ");
//					String ssn = scanner.nextLine();
//					System.out.print("전화번호: ");
//					String tel = scanner.nextLine();
//					acc[i] = new Account(name, ssn, tel);
//					System.out.println(acc[i]);
//				}
				break;
			case 3:
				// 예금 출금
				if (login == true) { //로그인 시 진행
					System.out.println("예금 출금");
				}
				else { 
					System.out.println("로그인 후 이용해주세요"); //로그인 아닐시 continue로 다시 위 반복문으로 돌아감
					continue;
				}
				while (run2) {
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
		System.out.println("프로그램이 종료됩니다.");
	}
}
