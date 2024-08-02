package day01;

class AA {
	int x;
	
	//생성자
	AA(){
		this(100); //다른 생성자를 호출
	}
	AA(int x){
		this.x = x;
	}
	
	//메서드
	void aa() //선언부
	{ 
		System.out.println("조상의 메서드 aa()"); //구현부
	}
}

class BB extends AA {
	int y;
	BB(){
		//x = 400;도 가능하지만 조상의 생성자를 호출해서 바꿔주는 것이 더 좋은 코드!
		super(400);
		y = 500;
	}
	
	@Override
	void aa() //오버라이딩 : 덮어쓰기
	{ 
		System.out.println("자손이 수정함 bb()");
	}
	void aa(int a) { //오버로딩 = 동명이인
		
	}
}


public class Main2 {

	public static void main(String[] args) {
		BB bb = new BB();
		System.out.println(bb.x);
		System.out.println(bb.y);
		bb.aa(); //매개변수 없는 메서드가 호출됨
	}
}
/*
오버라이딩
	- 덮어쓰기
	- 메서드의 선언부(매개변수 부분까지)는 같게 구현부만 다르게
	- 접근제어자 강하게(범위가 좁게) 못함(public -> private로 변경 불가)
	
어노테이션
	- 구별 쉽게 알려주는 역할
	- 생략 가능
	- @Override : 오버라이딩
*/
