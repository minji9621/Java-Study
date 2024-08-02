package day01;

class AAA {
	int x = 100;
}

class BBB extends AAA {
	int y = 111;
	int x = 222; //BBB 클래스의 변수
	
	//메서드
	void aa() {
		int x = 50; //지역변수
		System.out.println(x);
		System.out.println(this.x); //클래스 자신의 변수
		System.out.println(super.x); //조상클래스의 변수
	}
}

public class Main3 {
	public static void main(String[] args) {
		BBB b = new BBB();
		b.aa();
	}

}
