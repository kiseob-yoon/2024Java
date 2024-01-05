package chap03;

public class BreakEx2 {

	public static void main(String[] args) {
		Outter:for(int i = 0; i< 10; i++) { //Outter 레이블이라 불린다. 중첩 반복문 탈출하는 방법
			for(int j = 0; j<10; j++) {
				if(i == 3 && j == 3) {
					break Outter;
				}
				System.out.printf("(%d, %d)\n", i, j);
			}
		}

	}

}
