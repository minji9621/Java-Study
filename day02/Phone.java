package day02;

public abstract class Phone {
	// 변수
	String user;
	
	// 생성자
	// new 로 생성할 수 없기때문에
	// 자식 객체에서 super() 이용해서 생성해야 함.
	// 반드시 생성자 있어야한다.
	Phone(String user){
		this.user = user;
	}
	
	// 메서드
	void tutnOn() {
		System.out.println("전원을 켭니다.");
	}
	void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}






