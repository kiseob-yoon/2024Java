package sec03.exam01;

public class Sum {

	public static void main(String[] args) {
		int sum = 0;
		int start = 5;
		int end = 15;
		
		for(int i= start; i <= end; i++) {
			sum += i;
		}
		System.out.println(start +"부터 " + end + "까지 합계:" + sum);

	}

}
