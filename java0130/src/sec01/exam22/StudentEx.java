package sec01.exam22;

import java.util.HashMap;

public class StudentEx {

	public static void main(String[] args) {
		HashMap<Student,String> hashMap = new HashMap<Student, String>();
		hashMap.put(new Student("1"), "95"); 
		//hashCode 오버라이딩으로 같은 객체에 대해서 같은 해시코드를 가지게 함 여기서는 (1)
		String score = hashMap.get(new Student("1"));
		System.out.println("1번 학생의 총점: " + score);

	}

}
