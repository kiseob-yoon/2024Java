package chap03;

public class SwitchEx {

	public static void main(String[] args) {
		int num = (int)(Math.random()6)+1; //1~6(소숫점)int형 입혀져서 정수 1~6으로 나옴//+1을 해서 적어도 1이나오고 최대 6까지가능
		
		switch(num) { //가장 먼저 생성된 난수를 대입
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔습니다.");
			break;
		}
		int m = (int)(Math.random()6)+1;
		System.out.println(m);
		
	}

}
