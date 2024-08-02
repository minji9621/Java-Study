package day01;

class A {
	int x = 10;
}
class B extends A {
	int y = 20;
}
class C extends A {
	int z = 30;
}
class D extends B {
	int i = 40;
}

public class Main {
 public static void main(String[] args) {
	 B b = new B();
	 System.out.println(b.y);
	 System.out.println(b.x);
	 
	 C c = new C();
	 System.out.println(c.x);
	 System.out.println(c.z);
	 
	 D d = new D(); //D 객체 생성 -> A,B 객체도 생성된다.
	 System.out.println(d.y);
	 System.out.println(d.i);
	 System.out.println(d.x); //클래스 D의 조상 클래스인 B가 클래스 A를 상속받고 있기 때문에 가능 
 }
}
