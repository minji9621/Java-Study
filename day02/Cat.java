package day02;

public class Cat extends Animal {

	Cat(){
		this.kind = "포유류";
	}
	
	// 반드시 추상 메서드를 오버라이딩 해야함.
	@Override
	void sound() {
		System.out.println("야옹");
	}
}