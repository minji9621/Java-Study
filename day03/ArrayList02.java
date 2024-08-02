package day03;

import java.util.ArrayList;

public class ArrayList02 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		System.out.println(list1);
		
		ArrayList list2 = new ArrayList(list1);
		System.out.println(list2);
		//int a = 20;
		//int b = a;처럼 값을 복사하는 원리라고 생각하면 이해가 쉽다.
		//list1과 list2 둘 다 ArrayList타입으로 같은 타입이기 때문
	}

}
