package sec05.exam02;

public class StudentEx {

	public static void main(String[] args) {
		StudentService ss = StudentService.getInstance(); //StudentService는 student을 품고 있다.
		ss.student.name = "홍길동";
		ss.student.hakbun = "240120";
		ss.student.Kor = 92;
		ss.student.math = 80;
		ss.student.eng = 90;
		
		StudentService ss1 = StudentService.getInstance();
		System.out.println(ss.student.name);
		System.out.println(ss1.student.name);
		if(ss.student.equals(ss1.student)) {
			System.out.println("같다");
		}
		
		//똑같은 객체를 사용해서 같은 값 출력
	}

}
