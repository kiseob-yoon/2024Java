package sec01.exam02;

import java.util.HashMap;

public class KeyEx {

	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>(); //해쉬 맵 선언
		 
		hashMap.put(new Key(1), "홍길동"); //해쉬 맵에 값 추가하기 Key에는 객체생성하고 생성자로 1의 값을 넘겨주고, String은 홍길동
		
		String value = hashMap.get(new Key(1)); //해쉬맵에서 Key값이 1인 값을 가져온다. 
		System.out.println(value); 
	}

}
//equals를 오버라이딩해서 필드의 값과 객체의 값이 같게 한다.
//해쉬코드는 Key 필드에 의존하게 된다. 다른 객체라 할지라도 같은 해쉬코드를 지닐 경우 동일한 해시 버킷에 저장되게 되어 1이라는 키값을 통해 같은 값을 공유하게 된다.