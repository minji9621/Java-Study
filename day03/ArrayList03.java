package day03;

import java.util.*;
// * : ����

public class ArrayList03 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		// <> ���ʸ� ��� ����
		//<Ÿ��> : ������ Ÿ�Ը� ���� �� ����
		Date day = new Date();
		list.add("hello");
	  //list.add(day); ���ʸ�Ÿ������ <String>�� �����߱� ������ �ٸ� Ÿ���� ���� �߻� 
	  //list.add(100); ���ʸ�Ÿ������ <String>�� �����߱� ������ �ٸ� Ÿ���� ���� �߻�
		System.out.println(list);
		
		String str = list.get(0); //String Ÿ������ ���ʸ� ������ �߱� ������ String ��� ����
		System.out.println(str);
		
		ArrayList list2 = new ArrayList();
		list2.add("world");
		Object obj = list2.get(0); //0��°�� ���� ����
						//public E get(int index)
						//E : Element�� ���ڷ� ��� Ÿ���� �ǹ���
						//=> ��� Ÿ���� ���� �� �ִ°��� Object
		System.out.println(obj);
	}

}
