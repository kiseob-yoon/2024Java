package sec01.exam02;

public interface InterTest {
	void test(); //추상 메서드 사용이 원래 인터페이스의 목적
	default void test1() {
		System.out.println("test1()");
		
	}
	default void test3() {
		test4();
	};
	private void test4() {
		System.out.println("test4()");
	};
	static void test5() {
		System.out.println("test5()");
	}
}
