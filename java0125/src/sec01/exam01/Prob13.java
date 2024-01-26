package sec01.exam01;

public class Prob13 {
	
	void method(){
		System.out.println("method()");
	}
	void method2() {
		try {
			method();
			return;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("method2()-final");
		}
	}
	public static void main(String[] args) {
		Prob13 prob13 = new Prob13();
		prob13.method2();
	}

}
	