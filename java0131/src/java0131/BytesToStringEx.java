package java0131;

public class BytesToStringEx {

	public static void main(String[] args) {
		byte [] bytes = {73,32,108,111,118,101,32,121,111,117};
		String str = new String(bytes); //byte타입을 문자열로 변환
		System.out.println(str);
	}

}
