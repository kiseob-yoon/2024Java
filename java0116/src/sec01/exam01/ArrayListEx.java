package sec01.exam01;

import java.util.ArrayList;
import java.util.List;
class Student{
	String name;
	int kor;
	public Student(String name, int kor) {
		super();
		this.name = name;
		this.kor = kor;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + "]";
	}
	
}

public class ArrayListEx {

	public static void main(String[] args) {
		String [] strArr = new String[100]; //고정형 배열
		List<Student> slist = new ArrayList<>();
		slist.add(new Student("홍길동",90));
		slist.add(new Student("커리",95));
		slist.add(new Student("웸반야마",100));
		
//		ArrayList<Student> alist = new ArrayList<Student>(); 
//		//'어레이리스트'라고 읽음. 문자열을 가변적으로 배열로
//		List<String> list = new ArrayList<>(); //위의 축약형 List가 ArrayList의 부모
//		list.add("홍길동");
//		list.add("양규");
//		list.add("강감찬");
//		list.add("이순신");
		for(Student str:slist) {
			System.out.println(str);
		}
//		slist.set(0, "박하사탕",80);
//		for(Student str:slist) {
//			System.out.println(str);
//		}
		
		
	}

}
