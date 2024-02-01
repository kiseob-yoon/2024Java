package sec01.exam02;

public class Key {
	public int number; //필드
	
	public Key(int number) { //생성자
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) { //Key객체 받음(어떤 객체든 받을 수 있음)
		if(obj instanceof Key) { //Key 객체가 Key객체인 경우
			Key compareKey = (Key) obj; //다운캐스팅
			if(this.number == compareKey.number) { //현재 필드의 값과 객체의 값과 같으면
				return true; //true반환
			}
		}
		return false;
	}

	@Override
	public int hashCode() { //해쉬코드는 필드에 의존한다.
		return number;
	}
	
	
	
	
}
