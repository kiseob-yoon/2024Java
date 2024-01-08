package chap05;

public class StaticEx {

	public static void main(String[] args) { //정적 필드
		int y = 300;
		System.out.println(y);
		int x = 100;
		m1(y,x);
		System.out.println(x);
	}
	public static void m1(int x,int y) { // 매개변수, (일종의 지역변수)
		System.out.println(y);
		System.out.println(x);}

}
