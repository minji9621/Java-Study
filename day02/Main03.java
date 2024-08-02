package day02;
/*
* 강제 타입 변환 (Casting)
	- 부모타입을 자손의 타입으로 변환하는 것.
	- 그렇다고 모든 부모타입을 자손 타입으로 강제 변환 할 수 있다는 것은 아님.
	- 자손타입이 부모타입으로 자동 변환 된 후
	다시 자손 타입으로 변환 할 때 강제타입변환을 사용.
	
	자식클래스 변수 = (자식클래스) 부모타입의클래스 ; 
							-------------
					자식타입이 부모타입으로 변환이 된 상태
	
	- 자식타입이 부모타입으로 자동변환하면
	부모 타입에 선언된 멤버(변수,메서드)만 사용가능하다는 제약.
	- 자식 타입의 멤버를 꼭 사용해야 한다면
	변환 후에 자식의 멤버를 사용하면 됨.

*/
// Parent2 - Child2
public class Main03 {
	public static void main(String[] args) {
		Parent2 parent = new Child2();
		parent.var1 = "data";
		parent.method1();
		parent.method2();
		
		// 자식 객체의 변수에 접근
//		parent.var2 = "data2";	// 불가능
//		parent.method3();
		
		// 강제 타입변환
		Child2 child = (Child2) parent;
		child.var2 = "bbb";
		child.method3();
	}
}












