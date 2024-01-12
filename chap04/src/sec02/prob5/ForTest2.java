package sec02.prob5;

public class ForTest2 {

	public static void main(String[] args) {
		for(int i =0; i<4; i++) {
			for(int j=3; j>=0; j--) {
				if(i < j) { //i =0 j =3이면 3,2,1 세번의 공백
					System.out.print(" ");  	
				} else {
					System.out.print("*"); // i=0 j=0이면 else문 발동해서 *한개 찍음
				}
			}
			System.out.println();
		}
	}
}


//1. i = 0이면 j =3(초기값) 마이너스 증감식 3,2,1,0>=0; 4번을 찍는다
//2. if문 i(0)j(3,2,1) 3번 공백(왼쪽)
//3. else문 i(0) j(0) 1번찍기(오른쪽)
//4. 2~3의 과정을 반복하며 별이 공백은 1개씩 줄어들고 별을 하나씩 늘어간다.
