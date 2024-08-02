package day03;

public class StringEx03 {

	public static void main(String[] args) {
		String s1 = "hello world";
		String s2 = " hello world ";
		String s3 = "HELLO WORLD";
		System.out.println(s1.charAt(0)); //s1의 0번째 인덱스에 있는 문자 반환
		System.out.println(s1.indexOf('w')); //문자의 위치를 반환
		System.out.println(s1.indexOf('k')); //해당 문자가 없을 때 -1 반환
		System.out.println(s1.lastIndexOf('l')); //같은 문자들 중 가장 마지막에 있는 문자의 인덱스 위치 반환
		System.out.println(s1.replace('h', 'a')); //왼쪽을 오른쪽으로 대체
		System.out.println(s1.replaceAll("hello", "aaaa")); //문자열을 바꿔서 대체
		System.out.println(s1.toUpperCase()); //소문자를 대문자로 변환해주는 메서드
		System.out.println(s3.toLowerCase()); //대문자를 소문자로 변환해주는 메서드
		System.out.println(s1.substring(6)); //6번째 인덱스부터 끝까지 쭉 출력해준다.
		System.out.println(s1.substring(6,9)); //6번째 인덱스부터 8번째 인덱스까지(9번째는 미포함)
		System.out.println(s1.length()); //문자열의 길이이므로 1부터 시작한다.(인덱스 세듯이 0부터 세지 않음!!)
		System.out.println(s2.trim()); //앞,뒤 공백 제거해주는 메서드
		String s4 = "java html css spring";
		String[] s = s4.split(" ");
	}
}
