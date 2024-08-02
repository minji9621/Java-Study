package day03;

public class StringEx02 {
	public static void main(String[] args) {
		String str = "자바 프로그래밍";
		
		//.length() : 문자열의 길이, 개수, 크기
		int leng = str.length();
		System.out.println(leng);
		
		//.replace() : 특정 문자열을 다른 문자열로 대체
		str.replace("자바", "java");
		String str2 = str.replace("자바", "java");
		System.out.println(str2);
		
		//문자열 잘라내기
		//.substring(시작인덱스) : 시작인덱스(포함)부터 끝까지 출력
		String str3 = str.substring(4);
		System.out.println(str3);
		
		//.substring(시작,끝),시작은 포함하고 끝에 적은 것 미만
		String str4 = str.substring(3,5);
		System.out.println(str4);
		
		//.indexOf() : 문자열에서 특정 문자열의 위치를 나타냄
		int index = str.indexOf("프로그래밍");
		System.out.println(index);
		
		//.contains() : 단순 포함 유무 물을 때
		boolean contains = str.contains("프로그래밍");
		System.out.println(contains);
		
		//문자열 분리
		//.split() : 구분할 수 있는 것으로 분리할 때
		String str5 = "사과,딸기,포도,복숭아,바나나";
		String[] tokens = str5.split(",");
		
		System.out.println("index tokens[0] : " + tokens[0]);
		System.out.println("index tokens[4] : " + tokens[4]);
		
		//.valueOf(매개값) : 매개값을 문자열로 반환 
		String str6 = String.valueOf(100);
		System.out.println(str6);
		
		//.parseInt() : 문자열을 int 타입으로 변환
		//정수로 변환할 수 있는 문자열
		int str7 = Integer.parseInt("1000");
		System.out.println(str7);
	}
}
