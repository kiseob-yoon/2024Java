package sec01.exam07.pack2;

public class Child extends Parent{
	private int studentNo;
	
	public Child(String name,int studentNo) {
		super(name); 
		this.name = name;
		this.studentNo = studentNo;
	}
	
}

//final(값 재정의 불가) private(접근 불가)
