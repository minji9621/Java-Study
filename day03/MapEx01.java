package day03;

import java.util.HashMap;

public class MapEx01 {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		//.put(Ű,��) : �� �ֱ�
		map.put(33,"pw");
		map.put(100, "java");
		System.out.println(map);
		
		map.put(100, "test"); //key�� �ߺ� ��� �� ��
		System.out.println(map);
		
		map.put(200, "html");
		map.put(500, "css");
		System.out.println(map); //���� ���� X
		
		//.get(Ű) : �� ����
		String v = map.get(200);
		System.out.println(v);
		
		//.size() : ��ü�� ��
		int result = map.size();
		System.out.println(result);
	}

}
