package sec01.exam08;

import java.util.HashMap;

public class HashMapPractice {
	public static void main(String[]args) {
		
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		hashMap.put("apple", 3);
		hashMap.put("banana", 5);
		hashMap.put("orange", 4);
		
		System.out.println(hashMap.get("apple"));
		
		hashMap.put("apple", 6);
		System.out.println(hashMap.get("apple"));
		
		hashMap.remove("banana");
		
		for(String key: hashMap.keySet()) {
			System.out.println(key + ": " + hashMap.get(key));
		}
		
	}
}

//HashMap은 key와 value로 구성되어있다. 
//key는 유일해야하고 key값이 중복되면 나중에 선언된것을 교체한다.
//put(추가,변경), remove(제거), get(반환), size(크기), containsKey(포함) keySet(모든 key를 담은 set반환)