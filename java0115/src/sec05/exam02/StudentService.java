package sec05.exam02;

public class StudentService {
	Student student = new Student(); //StudentService라는 싱글톤 안에 객체를 생성해서 활용
	
	private static StudentService studentService = new StudentService(); //접근 .으로 접근 못하게 함
	private StudentService() {} //생성자 막음
	public static StudentService getInstance() { //이 메소드만 사용해서 객체를 써라
		//코딩 부분
		return studentService; 
	}
}
