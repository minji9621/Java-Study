package day03;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList05 {
	public static void main(String[] args) {
		//ArrayList 객체 생성
		ArrayList list = new ArrayList();
		
		list.add(new Integer(5)); // = list.add(5);와 같지만 여기서는 객체를 활용하였다.
		list.add(new Integer(4)); //1번 인덱스에 4를 대입 : 정확히는 Integer타입
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(3));
		
		System.out.println(list); //[5, 4, 2, 0, 1, 3] 출력
		
		// .subList(int 인덱스1,인덱스2)
		// .subList(인덱스시작(포함),인덱스(미만))
		list.subList(1, 4);
		
		ArrayList list2 = new ArrayList(list.subList(1, 4));
		System.out.println(list);
		System.out.println(list2);
		
		//.sort() : 정렬 -> 오름차순
		Collections.sort(list);
		Collections.sort(list2);
		
		System.out.println(list);
		System.out.println(list2);
		
		Collections.sort(list,Collections.reverseOrder());
		Collections.sort(list2,Collections.reverseOrder());
		System.out.println(list);
		System.out.println(list2);
		
		//.contains - 포함 유무 : true/false
		list.contains(0);
		System.out.println(list.contains(0));
		list2.contains(9);
		System.out.println(list2.contains(9));
		
		list.retainAll(list2); //괄호안에 들어간 list2에 있는 값을 list에 넣어주는 메서드
		System.out.println(list);
		System.out.println(list2);
	}
}

