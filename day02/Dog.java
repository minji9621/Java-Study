package day02;

public class Dog extends Animal {
	Dog(){
		this.kind = "포유류";
	}

	@Override
	void sound() {
		System.out.println("멍멍");	
	}
}