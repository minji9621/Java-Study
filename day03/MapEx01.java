package day03;

import java.util.HashMap;

public class MapEx01 {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		//.put(키,값) : 값 넣기
		map.put(33,"pw");
		map.put(100, "java");
		System.out.println(map);
		
		map.put(100, "test"); //key의 중복 허용 안 함
		System.out.println(map);
		
		map.put(200, "html");
		map.put(500, "css");
		System.out.println(map); //순서 유지 X
		
		//.get(키) : 값 꺼냄
		String v = map.get(200);
		System.out.println(v);
		
		//.size() : 객체의 수
		int result = map.size();
		System.out.println(result);
	}

}
