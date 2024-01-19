package anonymous;

class AnyClass {
	void mmm() {};
}

public class Ex {

	public static void main(String[] args) {
		AnyClass ac = new AnyClass() { //익명 자식 객체, 세미콜론해서 생성한 것과는 명확히 다르다. ac는 부모의 이름 따라서 형변환을 할 수 있는 이름 자체가 없다.
			@Override
			void mmm() {
				super.mmm();
			} 
		};

	}

}
