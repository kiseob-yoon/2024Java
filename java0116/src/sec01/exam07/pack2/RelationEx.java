package sec01.exam07.pack2;

public class RelationEx {

	public static void main(String[] args) {
		Child ch = new Child("녹색", 2);
		System.out.println(ch.name);

	}

}

//부모 클래스에서 생성자가 있기 때문에 자식은 반드시 그것을 사용해서 구현해야한다. 