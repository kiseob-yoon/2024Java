package sec02.exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Java {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		List<Account> list = new ArrayList<>();
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("1. 회원출력 | 2. 회원등록 | 3. 파일저장 | 4. 파일읽기 | 5. 종료");
			System.out.print("번호를 입력하세요: ");
			int num = scanner.nextInt();
			switch(num) {
			case 1: 
				System.out.println("회원출력");
				for(Account account : list) {
					System.out.println(account);
				}
				break;
			case 2:
				System.out.println("회원등록");
				scanner.nextLine();
				System.out.print("이름을 입력하세요: ");
				String scan1 = scanner.nextLine();
				System.out.print("아이디을 입력하세요: ");
				String scan2 = scanner.nextLine();
				System.out.print("패스워드를 입력하세요: ");
				int scan3 = scanner.nextInt();
				scanner.nextLine();
				System.out.print("전화번호를 입력하세요: ");
				String scan4 = scanner.nextLine();
				System.out.print("생년원일을 입력하세요: ");
				String scan5 = scanner.nextLine();
				System.out.print("잔고를 입력하세요:");
				int scan6 = scanner.nextInt();
				list.add(new Account(scan1,scan2,scan3,scan4,scan5,scan6));				
				break;
			case 3: //회원 정보를 파일에 저장하는 메뉴
				System.out.println("파일저장");
				FileOutputStream fos = new FileOutputStream("c:/temp/acc.db");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(list);
				oos.flush();
				oos.close();
				break;
			case 4: //회원 정보를 파일에서 읽어오는 메뉴
				System.out.println("파일읽기");
				FileInputStream fis = new FileInputStream("c:/temp/acc.db");
				ObjectInputStream ois = new ObjectInputStream(fis);
				list = (List<Account>) ois.readObject();
				for(Account account : list) {
					System.out.println(account);
				}
				ois.close();
				break;
			case 5: 
				System.out.println("종료");
				run = false;
				break;
				
		}
		
	}
System.out.println("프로그램 종료");
}
}
