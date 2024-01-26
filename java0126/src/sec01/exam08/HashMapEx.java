package sec01.exam08;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80); 
		map.put("홍길동", 95); //key값이 중복되면 나중의 것으로 replace된다
		System.out.println("총 Entry 수: " +map.size());
		System.out.println("\t홍길동 : " + map.get("홍길동")); //키 값으로 값을 얻는다.

		
		

	}

}
