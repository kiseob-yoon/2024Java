package chap03;

public class SwitchNoBreakCaseEx {

	public static void main(String[] args) {
		int time = (int)(Math.random()4)+8; //난수는 1이안되니 4로는 0~3나오는거고 +8해서 8~11이 출력됨
		System.out.println("[현재 시각]: " + time + "시");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
			break;
		case 9:
			System.out.println("회의를 합니다.");
			break;
		case 10:
			System.out.println("업무를 봅니다.");
			break;
		default:
			System.out.println("외근을 나갑니다.");
			break;
		}
		
		

	}

}
