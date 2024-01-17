package sec05.exam02;

public class Singleton {
	private static Singleton singleton = new Singleton(); // 클래스 외부에서 직접적으로 접근하는 것을 막아줌
	private Singleton() {} //생성자 private 제한
	static Singleton getInstance() { //사용법은 오직 이 메소드(그냥 메모리에 올라감)
		return singleton;
	
}
}
	

	
	 //Singleton 이라는 클래스가 하나의 인스턴스만을 갖도록 함
	 //시스템 전역에서 해당 인스턴스에 일관된 접근이 가능하게 함
	 //인스턴스를 새로 생성하지 않고, 필요한 시점에서 생성하여 성능을 향상시킬 수 있습니다.
		
//	public static void main(String[] args) {
//		Singleton obj1 = new Singleton();
//		Singleton obj2 = new Singleton();
//		
//		if(obj1 == obj2) {
//			System.out.println("같은 객체입니다.");
//		} else {
//			System.out.println("다른 객체입니다.");
//		}
//		
//		
//		
//	}

//}
