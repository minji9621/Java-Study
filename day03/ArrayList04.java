package day03;

import java.util.ArrayList;

public class ArrayList04 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		//1~10���� ���� �ְ� �� ���
		for(int i = 1; i <=10; i++) {
			 list.add(i);
			 System.out.println(list.get(i-1));
		}
	
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		System.out.println(list2);
		
		//for-each������ ���� �ϳ��� ������ ����ϱ�
		//for(���� : �ݺ����)
        for (int num : list2) {
            System.out.println(num);
        }
	}
}
