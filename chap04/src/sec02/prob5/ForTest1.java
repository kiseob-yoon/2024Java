package sec02.prob5;

public class ForTest1 {

	public static void main(String[] args) {
		for(int i=0; i<4; i++) {
			for(int j =0; j<=i; j++) {  
				System.out.print("*");
			}
			System.out.println();
		  }
	   }

}

//1. i = 0이면 j=0(초기값) 0<=0이라 만족하는 조건 1번 = *1번찍기
//2. i = 1이면 j=0(초기값) 0,1<=1이라 만족하는 조건 2번 = *2번찍기
//3. i = 2이면 j=0(초기값) 0,1,2<=2이라 만족하는 조건 3번 = *3번찍기
//4. i = 3이면 j=0(초기값) 0,1,2,3<=3이라 만족하는 조건 4번 = *4번찍기


