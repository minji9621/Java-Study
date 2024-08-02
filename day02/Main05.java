package day02;
/*
* 추상 (abstract)
	- 구체적이지 않은 클래스 : 미완성 클래스
	- 객체생성 불가
	- 상속-> 실체 클래스 -> 객체 생성
	- 자손 객체들의 공통죄는 특성을 추출해서 선언한 클래스
	- 추상 클래스-조상 / 실체 클래스-자손
	- 실체 클래스는 추상 클래스의 모든 변수/메서드를 상속 받고
	추가적인 특성을 가질 수 있다.
	
	- 선언
	public abstract class 클래스명{
		// 변수, 메서드
	}
*/
// Phone - SmartPhone
public class Main05 {
	public static void main(String[] args) {
//		Phone phone = new Phone();
		
		SmartPhone sPhone = new SmartPhone("java");
		
		sPhone.tutnOn();
		sPhone.internerSearch();	// 자손의 것
		sPhone.turnOff();
	}
}














