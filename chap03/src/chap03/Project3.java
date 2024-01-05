package chap03;

import java.util.Scanner;

public class Project3 {

	public static void displayMember(String memberName, String memberSSN, 
			                                             String memberTel) { //이름, 주민번호, 전화번호 출력 메소드
		System.out.println();
		System.out.println("[입력된 내용]");
		System.out.println("1. 이름: " + memberName);
		System.out.println("2. 주민번호 앞 6자리: " + memberSSN); 
		System.out.println("3. 전화번호: " + memberTel);
	}
	
	public static String input(String comment, Scanner scanner) { //comment로 문자열 받고 scanner로 사용자 입력값 받기
		System.out.print(comment); //문자열 출력 
		return scanner.nextLine(); // 입력값 반환
	}
	
	public static int displayBalance(boolean loginStatus, boolean run2, Scanner scanner,int balance) { //예끔 출금 메소드 
		if (loginStatus) {  // 로그인 여부
			run2 = true; // 조건식 참이면 true 대입
		} else { // 
			System.out.println("로그인 하시기 바랍니다."); 
		}
		while (run2) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			int menuNum2 = Integer.parseInt(scanner.nextLine()); //1,2,3,4 선택
			switch (menuNum2) { //전달 받은 1,2,3,4 번호값 중에서 입력받음
			case 1:
				System.out.print("예금액> "); 
				balance += Integer.parseInt(scanner.nextLine()); //예끔액 입력해서 balance대입. 입력하면 구문 탈출해서 다시 반복문
				break;
			case 2:
				System.out.print("출금액> ");
				balance -= Integer.parseInt(scanner.nextLine()); //출금액 입력해서 balance대입. 입력하면 구문 탈출 다시 반복문
				break;
			case 3:
				System.out.print("잔고> ");
				System.out.println(balance); //현재 잔고 확인. 확인 끝나면 구문 탈출 다시 반복문
				break;
			case 4:
				run2 = false; // 종료. 예금 출금 메소드 아예 빠져나감
				break;
			}
			System.out.println(); //줄바꿈
		}
		return balance; //잔고 반환
	}
	
	public static int question2(Scanner scanner) { // 스캐너 입력받음
		int status = 0; //현재 상태 초기값 0
		do {
			System.out.print("가입절차를 계속 진행 하시겠습니까?(y/n) "); // 출력구문
			String answer = scanner.nextLine(); //입력값 answer에 대입
			switch (answer) { //answer값이 n,N이면 
			case "n":
			case "N":
				status = 1; // 상태 1
				return status; //상태 반환 switch문 탈출
			case "y": //answer값이 y,Y이면 
			case "Y":
				status = 2; //상태 2
				return status; //상태 반환 switch문 탈출
			}
		} while(true); //y,n값이 입력안될시 무한반복
	}
	
	public static int question(Scanner scanner) {
		int status = 0;
		do {
			System.out.print("가입절차를 계속 진행 하시겠습니까?(y/n) ");
			String answer = scanner.nextLine();
			if (answer.equals("n") || answer.equals("N")) {
//				run = true;
//				continue AAA;
				status = 1;
				return status;
			} else if (answer.equals("y") || answer.equals("Y")) {
				status = 2;
				return status;
			}
		} while(true);
	}
	
	public static void menu() { //메뉴 출력 메소드
		System.out.println("-------------------------------------");
		System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
		System.out.println("-------------------------------------");
		System.out.print("선택> ");
	}
	
	public static int login(boolean membershipStatus, boolean loginStatus, // 로그인 메서드 
			              Scanner scanner, String memberName, String memberSSN) {
		int status = 0; // 상태 초기화
		if (!membershipStatus) { //회원 가입 상태가 아니라면
			status = 1; // 상태 1
			System.out.println("회원 가입을 하시기 바랍니다.");
			return status; //상태값 반환 후 구문 빠져나감
		}
		if (loginStatus) {  // 로그인 여부 확인
			status = 2; // 상태 2
			System.out.println("이미 로그인 상태입니다.");
			return status; //상태값 반환 후 구문 빠져나감
		}
		System.out.print("아이디:");  //출력문
		String name = scanner.nextLine(); // name 변수의 값 입력
		System.out.print("패스워드:");
		String strPassword = scanner.nextLine();//패스워드입력
		if (name.equals(memberName)) { // 입력한 이름이 회원가입했던 문자와 일치하고 
			if (strPassword.equals(memberSSN)) { // 입력한 패스워드가 회원가입했던 패스워드와 일치하면
				status = 3; //상태 3
				System.out.println("로그인 성공"); 
			} else {
				System.out.println("로그인 실패:패스워드가 틀림"); //비밀번호 틀리면 출력
			}
		} else {
			System.out.println("로그인 실패:아이디 존재하지 않음"); //아이디 틀리면 출력
		}
		return status; //상태반환하고 구문 빠져나감
	}
	
	public static int already(boolean membershipStatus,String memberName,Scanner scanner) {
		int status = 0; //상태 값 초기화
		if (membershipStatus) { //회원이면
			System.out.println("이미 회원 가입을 하셨습니다.");
			System.out.println("회원이름:"+memberName); 
			switch (question2(scanner)) { //스캐너에 입력한 값이 있으면 
			case 1: 
				status = 1; 
//				continue;
			case 2:
				break;
			}
		}
			return status;
	}
	
	public static void main(String[] args) {
		String memberName = "";
		String memberSSN = "";
		String memberTel = "";
		int balance = 0;
		boolean loginStatus = false; // 로그인 여부
		boolean membershipStatus = false; // 회원가입 여부
		Scanner scanner = new Scanner(System.in);
		boolean run = true; //main while
		boolean run2 = false; // 입출금 while
		
		while (run) {
			menu(); //메뉴판 출력
			int menuNum = Integer.parseInt(scanner.nextLine()); //1,2,3,4중에 원하는 메뉴 고르기
			switch (menuNum) { 
			case 1: //로그인창
				switch (login(membershipStatus, loginStatus, scanner, memberName, memberSSN)) {
				case 1:  // 회원 가입이 필요한 상태
				case 2:  // 이미 로그인한 상태
					continue;
				case 3:  // 로그인 성공 상태
					loginStatus = true;
					break;
				}
				break;
			case 2: //회원가입창
				already(membershipStatus,memberName,scanner); //이미 회원가입되었다는 메시지 호출
				
				memberName = input("[필수 정보 입력]\n1. 이름: ", scanner); //input으로 문자열과 스캐너로 입력한 값을 변수에대입
				memberSSN = input("2. 주민번호 앞 6자리: ", scanner); 
				memberTel = input("3. 전화번호: ", scanner);
				
				displayMember(memberName, memberSSN, memberTel); // 입력된 내용 출력
				loginStatus = false; //로그인은 안한상태
				membershipStatus = true; //회원가입 완료
				break;
			case 3: //입출금창
				balance = displayBalance(loginStatus, run2, scanner,balance); //메인 메소드에 정의된 변수들을 메소드에 던짐
				break;
			case 4: //종료
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}