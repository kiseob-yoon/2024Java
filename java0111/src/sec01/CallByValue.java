package sec01;



public class CallByValue {
	
	public static void increase(int m, MyClass c) { //(지역변수) 값을 복붙 
		m = m + 1;
		System.out.println(m);
		c.n +=1;
	}
	
	public static void main(String[] args) {
		int n = 100;
		MyClass mc = new MyClass();
		System.out.println(mc.n);
//		increase(n,mc);
		increase(n, new MyClass());
		System.out.println(n);
		System.out.println(mc.n);
		
	
	}
}
class MyClass{
	int n; //초기값 0 
}
