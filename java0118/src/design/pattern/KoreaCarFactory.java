package design.pattern;

// 국산차 생상 공정
public class KoreaCarFactory  extends CarFactory{

	@Override
	public TireProduct createTire() { //부모인 TireProduc 변수로 자식인 koreaTireProduct로 반환
		return new KoreaTireProduct();
	}

	@Override
	public DoorProduct createDoor() {
		return new KoreaDoorProduct();
	}
	
	

}
