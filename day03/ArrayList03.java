package day03;

import java.util.*;
// * : 모든것

public class ArrayList03 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		// <> 제너릭 사용 권장
		//<타입> : 지정된 타입만 넣을 수 있음
		Date day = new Date();
		list.add("hello");
	  //list.add(day); 제너릭타입으로 <String>을 지정했기 때문에 다른 타입은 오류 발생 
	  //list.add(100); 제너릭타입으로 <String>을 지정했기 때문에 다른 타입은 오류 발생
		System.out.println(list);
		
		String str = list.get(0); //String 타입으로 제너릭 지정을 했기 때문에 String 사용 가능
		System.out.println(str);
		
		ArrayList list2 = new ArrayList();
		list2.add("world");
		Object obj = list2.get(0); //0번째의 값을 꺼냄
						//public E get(int index)
						//E : Element의 약자로 모든 타입을 의미함
						//=> 모든 타입을 받을 수 있는것은 Object
		System.out.println(obj);
	}

}
