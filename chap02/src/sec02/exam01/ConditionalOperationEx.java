package sec02.exam01;

public class ConditionalOperationEx {

	public static void main(String[] args) {
		int score = 70;
		String grade = (score > 90) ? "A" : score >80 ? "B" : "C"; // 타입 변수 = (조건) ? true출력문: false출력문;
		System.out.println(grade);
		

	}

}
