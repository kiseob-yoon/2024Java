package java0116;

class A{ //조부모
	public A(){ 
		System.out.println("생성자A"); //3.출력
	}
}
class B extends A{ //부모
	public B() {
		super(); //2.부모 A를 호출
		System.out.println("생성자B"); //4.출력
	}
}

class C extends B{ //자식
	public C() {
		super(); //1.부모를 B 호출
		System.out.println("생성자C"); //5.출력
	}
}

public class ConsturctorEx {

	public static void main(String[] args) {
		C c = new C();
		
	}

}
