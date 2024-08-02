package day02;
/*
* 다형성
	- 같은 타입이지만 실행 결과가 다양한 객체를 이용 할 수 있는 성질.
	- 하나의 타입(자료형)에 여러 객체를 대입 -> 다양한 기능 이용 가능.
	- 자바는 조상클래스로의 타입변환을 허용.
	부모 타입에 모든 자손 객체가 대입 가능하다는 의미. 
	
* 클래스의 타입 변환
	- 상속관계에 있는 클래스 사이에서 발생.
	- 자손타입은 부모타입으로 자동 타입 변환 가능.
	자동 타입 변환의 개념 :
		자손은 부모의 특징(속성)과 기능을 상속 받기 때문에
		부모와 동일하게 취급될 수 있다는 것.
		A a = new B(); 가능하다.
		
* 참조변수의 == 연산
 	참조 주소값이 같을 경우 true 결과가 나옴.
 	동일한 객체를 참조하고 있다는 의미.
	
	바로 위의 조상이 아니더라도 상속계층에서 상위 타입이라면
	자동 타입 변환이 일어날 수 있다.
	
	그림으로 그려봐라~~
		
*/

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class Main01 {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b2 = d;
		C c2 = e;
		
//		B b3 = e;	불가능
//		C c3 = d;
	}
}