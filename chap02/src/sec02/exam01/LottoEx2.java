package sec02.exam01;

public class LottoEx2 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
		int num = (int)(Math.random()45+1);
		int filter = num;
		if(filter == num) {
			System.out.println(num);
			continue;
		}
		}
	}

}
