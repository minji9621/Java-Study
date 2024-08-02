package day03;

import java.util.ArrayList;

public class ArrayList01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(new Integer(5)); // = list.add(5);
		list.add(new Integer(4));
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(3));
		
		//ArrayList 객체 생성
		ArrayList list2 = new ArrayList(); //타입 지정 안함.
		//크기 생성 안함(값을 계속 넣고 뺼 수 있음)
		System.out.println(list2);
		
		//값 넣기(추가)
		list2.add(100); //정수형
		list2.add("hello"); //문자열
		System.out.println(list2); //출력해보면 [100, hello]이 나옴
		
		list2.add(100); 
		list2.add("hello");
		System.out.println(list2); //출력해보면 [100, hello, 100, hello]이 나옴
		//중복을 허용함
		
		Data d = new Data();//Data클래스의 객체 생성
		list2.add(d);
		System.out.println(list2); //[100, hello, 100, hello, day03.Data@1c4af82c]
		//타입 상관 없음
		
		Data d2 = new Data();
		list2.add(d2);
		list2.add(0, 700); //괄호 첫번째 숫자는 뒤에 붙는 값의 인덱스 자리를 뜻함(0번지에 700이 들어가있음)
		System.out.println(list2);
		
		list2.set(0, 77); //set(인덱스,값)은 수정을 해주는 메서드
		System.out.println(list2); //0번지에 있던 700을 77로 수정한다는 뜻
		
		//size()메서드는 저장된 데이터의 개수를 알려준다.리턴값은 정수형으로 반환해줘야 함
		int a = list2.size(); 
		System.out.println(a);
		System.out.println(list2.size());
		
		//.get(인덱스) : 저장된 인덱스값 리턴
		list2.get(1); 
		System.out.println(list2.get(1)); //인덱스 1번지에 있는 값 출력
		
		//.remove(인덱스) : 지정된 인덱스값 삭제
		list2.remove(5);
		System.out.println(list2);
		
		//.clear() : 전체 삭제
		list2.clear();
		System.out.println(list2); //결과 : []
	}
}

class Data{}
