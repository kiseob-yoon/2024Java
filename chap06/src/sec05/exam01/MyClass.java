package sec05.exam01;

public class MyClass {
	int x;
	int y;
	int z;
	
	
	public MyClass(int x) {
//		this.x = x;
		this(x,0,0); //3번째 MyClass생성
		System.out.println("1번째 생성자");
	}


	public MyClass(int x, int y) {
//		this.x = x;
//		this.y = y;
		this(x,y,0);
		System.out.println("2번째 생성자");
	}


	public MyClass(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("명령");
		System.out.println("3번째 생성자");
	}
	

	@Override
	public String toString() {
		return "MyClass [x=" + x + ", y=" + y + ", z=" + z + "]";
	}


	public static void main(String[] args) {
		MyClass mc = new MyClass(120,300);
		System.out.println(mc);
		MyClass mc1 = new MyClass(120);
		System.out.println(mc1);

	}

}
