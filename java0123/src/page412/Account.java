package page412;



public class Account {
	Name name = new Name();
	static School school = new School(); //static이 붙어야만 Account가 없어도 생성가능하기 때문. 즉, static이 붙은 클래스로 객체를 생성하기 위해서는 받는 변수도 static이어야 한다.
	
	class Name {}
	static class School {} //Account.School로 접근 가능
	
//중첩은 종속이 된다. static 필드는 객체생성과 상관없이 사용할 수 있다. static 클래스로 생성해서 초기화해야 한다. 
	
}
