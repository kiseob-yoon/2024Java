package sec01.exam01;

public class ExitEx {

	public static void main(String[] args) {
		for(int i= 0; i<10; i++) {
			System.out.println(i);
			if(i == 5) {
				System.exit(0); //강제종료로 더 이상 코드를 해석하지 않고 종료시킴
//				break; //break를 쓰면 for문 종료하고 아래로 쭉쭉가게 하면 됨
			}
		}
		System.out.println("마무리");
	}

}
