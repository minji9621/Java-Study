package day02;
/*
* instanceof 
	- 어떤 객체가 어떤 클래스의 인스턴스(객체)인지 확일할 때 사용.
	- instanceof 를 기준으로 왼쪽에 객체, 오른쪽에 타입이 온다.
	- 왼쪽의 객체가 오른쪽의 타입으로 생성 되었다면 true
	아니면 false 리턴.
	
	- 매개값의 타입을 조사할때 주로 사용.
	- 메서드 내에서 강제 타입변환이 필요한 경우
	매개값이 어떤 객체인지 instanceof 연산자로 확인하고
	안전하게 타입변환을 해야한다.
	- 확인을 한했을 경우 ClassCastException 예외가 발생 할 수 있다.
*/
// Parent3 - Child3
public class Main04 {
	// 메서드 1,2 모두 Parent3 타입의 매개값 선언
	public static void method1(Parent3 parent3) {
		if( parent3 instanceof Child3 ) {// Child3 타입으로 변환이 가능한지 확인
			Child3 child3 = (Child3) parent3;
			System.out.println("method1- Child3 으로 변환 성공");
		} else {
			System.out.println("method1- Child3 으로 변환 실패");
		}
	}
	
	public static void method2(Parent3 parent3) {
		Child3 child3 = (Child3) parent3;
		System.out.println("method2-Child3 으로 변황 성공");
	}
	
	public static void main(String[] args) {
		Parent3 parentA = new Child3();
		
		// Child3 객체를 매개값으로 보냄.
		method1(parentA);
		method2(parentA);
		
		Parent3 parentB = new Parent3();
		// Parent3 객체를 매개값으로 보냄.
		method1(parentB);
		method2(parentB);	// 예외 발생
	}
}