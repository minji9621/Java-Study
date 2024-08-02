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
		
		//ArrayList ��ü ����
		ArrayList list2 = new ArrayList(); //Ÿ�� ���� ����.
		//ũ�� ���� ����(���� ��� �ְ� �E �� ����)
		System.out.println(list2);
		
		//�� �ֱ�(�߰�)
		list2.add(100); //������
		list2.add("hello"); //���ڿ�
		System.out.println(list2); //����غ��� [100, hello]�� ����
		
		list2.add(100); 
		list2.add("hello");
		System.out.println(list2); //����غ��� [100, hello, 100, hello]�� ����
		//�ߺ��� �����
		
		Data d = new Data();//DataŬ������ ��ü ����
		list2.add(d);
		System.out.println(list2); //[100, hello, 100, hello, day03.Data@1c4af82c]
		//Ÿ�� ��� ����
		
		Data d2 = new Data();
		list2.add(d2);
		list2.add(0, 700); //��ȣ ù��° ���ڴ� �ڿ� �ٴ� ���� �ε��� �ڸ��� ����(0������ 700�� ������)
		System.out.println(list2);
		
		list2.set(0, 77); //set(�ε���,��)�� ������ ���ִ� �޼���
		System.out.println(list2); //0������ �ִ� 700�� 77�� �����Ѵٴ� ��
		
		//size()�޼���� ����� �������� ������ �˷��ش�.���ϰ��� ���������� ��ȯ����� ��
		int a = list2.size(); 
		System.out.println(a);
		System.out.println(list2.size());
		
		//.get(�ε���) : ����� �ε����� ����
		list2.get(1); 
		System.out.println(list2.get(1)); //�ε��� 1������ �ִ� �� ���
		
		//.remove(�ε���) : ������ �ε����� ����
		list2.remove(5);
		System.out.println(list2);
		
		//.clear() : ��ü ����
		list2.clear();
		System.out.println(list2); //��� : []
	}
}

class Data{}
