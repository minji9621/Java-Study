package day03;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList05 {
	public static void main(String[] args) {
		//ArrayList ��ü ����
		ArrayList list = new ArrayList();
		
		list.add(new Integer(5)); // = list.add(5);�� ������ ���⼭�� ��ü�� Ȱ���Ͽ���.
		list.add(new Integer(4)); //1�� �ε����� 4�� ���� : ��Ȯ���� IntegerŸ��
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(3));
		
		System.out.println(list); //[5, 4, 2, 0, 1, 3] ���
		
		// .subList(int �ε���1,�ε���2)
		// .subList(�ε�������(����),�ε���(�̸�))
		list.subList(1, 4);
		
		ArrayList list2 = new ArrayList(list.subList(1, 4));
		System.out.println(list);
		System.out.println(list2);
		
		//.sort() : ���� -> ��������
		Collections.sort(list);
		Collections.sort(list2);
		
		System.out.println(list);
		System.out.println(list2);
		
		Collections.sort(list,Collections.reverseOrder());
		Collections.sort(list2,Collections.reverseOrder());
		System.out.println(list);
		System.out.println(list2);
		
		//.contains - ���� ���� : true/false
		list.contains(0);
		System.out.println(list.contains(0));
		list2.contains(9);
		System.out.println(list2.contains(9));
		
		list.retainAll(list2); //��ȣ�ȿ� �� list2�� �ִ� ���� list�� �־��ִ� �޼���
		System.out.println(list);
		System.out.println(list2);
	}
}

