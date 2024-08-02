package day02;

public class SmartPhone extends Phone {
	// 생성자
	SmartPhone(String user) {
		super(user);	// 조상 생성자 호출
	}
	
	// 메서드
	void internerSearch() {
		System.out.println("검색을 합니다.");
	}

}