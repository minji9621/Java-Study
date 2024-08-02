package day03;
/*
 String 클래스
 - 자바 문자열을 사용할 수 있도록 String 클래스 제공
 1.생성자를 이용하는 방식
 2.코드상에서 String 객체가 자동 생성되는 방식
 */


public class StringEx01 { //String이라는 타입이 이미 존재하기 때문에 클래스 이름을 만들수 없음

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); //false,new 새로운 객체.주소 다름.
		System.out.println(str1.equals(str2)); //true,객체가 가진 문자열 비교
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
	}

}
