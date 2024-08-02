package day02;
/*
	부모 타입으로 자동 변환이 된 후에는
	부모 클래스에서 선언된 변수와 메서드만 접근 가능.
	변수는 자식 객체를 참조하지만 
	접근 가능한 멤버(변수,메서드)는 부모 클래스의 멤버이다.
	
	이때, 자손이 오버라이딩 했다면 
	오버라이딩 한 메서드가 호출 됨.
*/
// Parent - Child
public class Main02 {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;	// 자동 타입 변환
		parent.method1();
		parent.method2();// 오버라이딩 된 메서드 호출
		
//		parent.method3();// 호출 불가능
	}
}