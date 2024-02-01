package sec01.exam22;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}



	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
		 if(studentNum.equals(student.getStudentNum())){
		return true;
	}
	}
	return false;
}
	
	@Override
	public int hashCode() { //같은 객체에 대해서 항상 같은 해시코드를 반환
		return studentNum.hashCode();
	}
}

