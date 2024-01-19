package com.array;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Acc implements Serializable{ //인터페이스를 구현하고 있다. 이는 해당 클래스의 객체가 직렬화될 수 있음을 나타낸다.
	int x; //직렬화될 필드 
	String y; //직렬화될 필드
	
	@Override
	public String toString() { //객체의 문자열 표현을 반환
		return "Acc [x=" + x + ", y=" + y + "]";
	}
	
}

public class ObjEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Acc acc = new Acc(); 
		acc.x = 100; 
		acc.y = "가나다";
		System.out.println(acc);
		FileOutputStream fos = new FileOutputStream("c:/temp/acc.db");
		//FileOutputStream은 파일에 데이터를 쓰기 위한 스트림. 경로에 있는 파일에 데이터를 쓰기 위해 객체를 생성
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		//ObjectOutputStream은 객체를 직렬화하여 출력하기 위한 스트림 FileOutputStream을 이용하여 파일에 데이터를 쓸 수 있게 한다.
		oos.writeObject(acc); 
		//oos(객체를 직렬화하여 출력하기 위한 스트림)에 접근하여 전달받은 객체를 직렬화하여 출력해준다. acc 객체가 이 메서드에 전달되면, 해당 객체는 직렬화되어 바이트 형태로 출력 스트림에 쓰인다. 
		oos.flush();
		//출력 스트림의 버퍼에 남아있는 모든 데이터를 강제로 출력한다.
		oos.close();
		//출력 스트림을 닫는다.
		
		FileInputStream fis = new FileInputStream("c://temp/acc.db");
		//FileOutputStream 파일에서 데이터를 읽어오기 위한 입력 스트림이다. 경로에 있는 파일에 데이터를 읽어오기 위해 객체를 생성
		ObjectInputStream ois = new ObjectInputStream(fis);
		//ObjectInputStream 객체를 역직렬화하여 읽어오기 위한 입력 스트림이다.
		Acc acc2 = (Acc) ois.readObject(); 
		//readObject 메서드는 직렬화된 객체를 읽어와 역직렬화한다. 읽어온 객체는 Object 타입이므로, 원래 객체의 타입으로 캐스팅해야 한다.
		System.out.println(acc2); //acc2 객체의 toString 메서드가 호출되어 객체의 문자열 표현이 출력됩니다.
	}
	
	Acc acc = new Acc(); 
	acc.x = 100; 
	acc.y = "가나다";
	System.out.println(acc);
	FileOutputStream fos = new FileOutputStream("c:/temp/acc.db");
	ObjectOutputStream oos = new ObjectOutputStream(fos); 
	oos.writeObject(acc); 
	oos.flush();
	oos.close();
	
	FileInputStream fis = new FileInputStream("c://temp/acc.db");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Acc acc2 = (Acc) ois.readObject(); 
	System.out.println(acc2);


}
