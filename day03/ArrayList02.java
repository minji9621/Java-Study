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
		//int b = a;ó�� ���� �����ϴ� ������� �����ϸ� ���ذ� ����.
		//list1�� list2 �� �� ArrayListŸ������ ���� Ÿ���̱� ����
	}

}
