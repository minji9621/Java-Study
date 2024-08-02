package day02;

public class Child extends Parent {
	@Override
	void method2() {
		System.out.println("Child - method2()");
	}
	
	// 자손 클래스의 메서드
	void method3() {
		System.out.println("Child - method3()");
	}
}