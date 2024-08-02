package day01;

public class Car2Main {
	public static void main(String[] args) {
		//객체 생성
		//클래스 이름 = new 클래스명(매개변수);
		Car2 c1 = new Car2("현대"); //매개변수가 1개인 생성자 사용,매개변수 타입에 맞는 값을 넣어줘야 함
		Car2 c2 = new Car2("기아","아반떼"); //매개변수가 2개인 생성자 사용
		Car2 c3 = new Car2("르노","봉고차",300);
		Car2 c4 = new Car2("르노","봉고차",300,"검정");
		System.out.println("c4.company : " + c4.company);
		System.out.println("c4.model : " + c4.model);
		System.out.println("c4.maxSpeed : " + c4.maxSpeed);
		System.out.println("c4.color : " + c4.color);
		
		c1.company = "기아";
		System.out.println(c1.company);
	}
}
/* 
 오버로딩
 생성자/메서드
 -이름이 같다.
 -매개변수의 타입,순서,개수가 달라야한다.
 */