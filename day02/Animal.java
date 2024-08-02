package day02;
// 추상 클래스
public abstract class Animal {
	String kind;
	
	void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상 메서드 - 구현부의 영역 {} 없음.
	abstract void sound();
}