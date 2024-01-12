package sec05.exam01;

public class CircleEx {

	public static void main(String[] args) {
		Circle[]c; //stack영역 생성
		c = new Circle[5]; //5개의 공간 만듬
		
		for(int i=0; i<c.length; i++)  
			c[i] = new Circle(i); 
			
		for(int i=0; i<c.length; i++) 
			System.out.println(c[i].getArea() + "");
		
	}

}


//1. 배열의 방을 new[5] 숫자 크기만큼 생성
//2. 반복문 돌면서 배열의 순번대로 값0~4의 값 대입
//3. 대입을 받은 변수 c로 getArea메소드 접근 3.14*radius*radius 계산
//c[0] = 0 -> 3.14 * 0 = 0
//c[1] = 1 -> 3.14 * 1 * 1 = 3.14
//c[2] = 2 -> 3.14 * 2 * 2 = 12.56
//c[3] = 3 -> 3.14 * 3 * 3 = 28.26
//c[4] = 4 -> 3.14 * 4 * 4 = 50.24

