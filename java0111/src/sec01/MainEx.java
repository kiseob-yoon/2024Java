package sec01;

public class MainEx {

	public static void main(String[] ar) {
		if(ar.length !=2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0); // 0: 정상 종료
		}
		String str = ar[0];
		System.out.println(str);
	}

}
