package day02;
/*
* 인터페이스 (interface)
	- 객체의 사용방법을 정의한 타입
	- 인터페이스는 여러 객체들과 사용 가능하므로 어떤 객체를 사용하느냐에
	따라서 실행 결과와 리턴값이 다를 수 있다.
	즉, 개발 코드 측면에서는 코드 변경없이 실행 내용과 리턴값을 
	다양화 할 수 있다는 장점 가짐.

* 선언
	public interface 인터페이스명 {.....}
	: public - 다른 패키지에서도 접근 가능.
* 구성
	클래스(생성자, 변수 , 메서드)
	상수와 메서드만 가짐.
	
* 상수 변수
	[public static final] 타입 변수명 = 값;
	
* 다중 인터페이스 구현 가능
	public class 클래스명 implements 인터페이스A, 인터페이스B, ... {
		// 반드시 인터페이스들의 메서드 구현해야함.
	}
*/
// RemoteControl - Television - Audio
public class Main07 {
	public static void main(String[] args) {
		// 인터페이스 변수;
		RemoteControl rc;
		// 변수 = 구현객체생성;
		rc = new Television();
		rc = new Audio();
		
		
		RemoteControl rc2 = null;
		rc2 = new Television();
		rc2.turnOn();
		rc2.setVolume(100);
		rc2.setVolume(5);
		rc2.turnOff();
		System.out.println("====");
		
		rc2 = new Audio();
		rc2.turnOn();
		rc2.turnOff();
	}
}