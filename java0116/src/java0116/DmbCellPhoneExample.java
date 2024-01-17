package java0116;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		DmbCellPhone dmbCellphone = new DmbCellPhone("구글폰", "블루", 10);
		
		System.out.println("모델: " + dmbCellphone.model);
		System.out.println("색상: " + dmbCellphone.color);
		
		System.out.println("채널: " + dmbCellphone.channel);
		
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("여보세요");
		dmbCellphone.receiveVoice("모시");
		dmbCellphone.sendVoice("하이");
		dmbCellphone.hangUp();
		
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOffDmb();

	}

}

//DmbCellPhone(자식)은 CellPhone(부모)의 상속을 받음 
//DmbCellPhone에서 생성자를 생성하는데 이때 필드의 변수를 부모의 것으로 사용함
//main메서드에서는 생성자에게 넘겨줄 값을 설정한다. //자식의 객체로 접근하여 생성자로 전달받은 값 출력 //부모에게서 상속받은 메서드 활용
