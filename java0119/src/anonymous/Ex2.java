package anonymous;

interface Inter{
	void disp();
}

public class Ex2 {

	public static void main(String[] args) {
		Inter it = new Inter() { //익명 자식 객체 생성, it은 인스턴스를 참조하기 위한 변수
			int y = 100; //변수 정의 및 초기화
			public void disp2() { 
				System.out.println("disp2");
			}
			@Override
			public void disp() { //부모의 메서드 재정의
				System.out.println(y); //오버라이딩 하지 않은 것은 외부에서 사용불가(내부에서는 사용가능) 
			}
		};
		it.disp();
	}

}
