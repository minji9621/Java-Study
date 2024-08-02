package day02;
/*
* 추상 메서드
	- 메서드의 선언만 통일하고 구현 내용이 달라야 할 경우 사용.
	- 추상 메서드는 추상 클래스에서만 선언 가능
	- 메서드의 선언부만 있고 구현구 즉, 실행 영역인 {}이 없는 것.
	- 상속 받는 자식 클래스는 반드시 추상메서드를 오버라이딩(재정의) 해야 함.
*/
public class Main06 {
	public static void animalSound( Animal animal ) {
		animal.sound();
	}
	
	public static void main(String[] args) {
		// sound() 메서드를 호출하는 방법
		// Cat Dog 객체 생성 후 호출
		Cat cat = new Cat();
		Dog dog = new Dog();
		cat.sound();
		dog.sound();
		System.out.println("======");
		
		// 변수의 타입 변환
		// 부모 변수에 자식의 객체 대입
		Animal animal = null;
		animal = new Cat();	// 자동 타입변환
		animal.sound();
		
		animal = new Dog();
		animal.sound();
		System.out.println("======");
		
		// 매개변수의 자동 타입 변환
		// 위와 같지만 매개변수로 활용
		animalSound(new Cat());
		animalSound(new Dog());
	}
	
}