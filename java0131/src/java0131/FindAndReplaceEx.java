package java0131;

public class FindAndReplaceEx {

	public static void main(String[] args) {
		String strDate1 = "200";
		int intData1 = Integer.parseInt(strDate1); //숫자형으로 변환 
		
		int intData2 = 150;
		String strData2 = String.valueOf(intData2); //문자열로 변환
		
		String str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		int index = str.indexOf("자바"); //인덱스 찾기
		System.out.println(index);
		str = str.replace("자바", "java"); //대체함 새로찍음
		System.out.println(str);
		
	}

}
