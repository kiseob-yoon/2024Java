package sec01.exam01;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}

	@Override
	public String toString() { 
		return "member 객체 ["+ id +"] ";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { //멤버로 객체생성되었니?
			Member member = (Member) obj; //문자열 비교하려고 강제 형변환(형변환해야 member로 접근이 가능)
			if(id.equalsIgnoreCase(member.id)) {//필드의 id와 객체의 id가 같으면 true반환  
				return true;
			}
		}
		return false;
	}

	@Override //해시코드를 재정의해서 id를 소문자, 해시코드 반환
	public int hashCode() {
		return id.toLowerCase().hashCode(); 
	}
	                                                                                                                                                                                                                                                                                                                                                              
	
}
