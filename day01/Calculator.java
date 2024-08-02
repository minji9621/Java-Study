package day01;

public class Calculator { //계산기
	//메서드
	//리턴타입 메서드이름(매개변수,...){구현코드}
	int plus(int a, int b) {
		return a + b;
	}
	
	int minus(int a, int b) {
		return a - b;
	}
	
	//리턴타입이 없는 메서드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
