package day01;

public class Car2Main {
	public static void main(String[] args) {
		//��ü ����
		//Ŭ���� �̸� = new Ŭ������(�Ű�����);
		Car2 c1 = new Car2("����"); //�Ű������� 1���� ������ ���,�Ű����� Ÿ�Կ� �´� ���� �־���� ��
		Car2 c2 = new Car2("���","�ƹݶ�"); //�Ű������� 2���� ������ ���
		Car2 c3 = new Car2("����","������",300);
		Car2 c4 = new Car2("����","������",300,"����");
		System.out.println("c4.company : " + c4.company);
		System.out.println("c4.model : " + c4.model);
		System.out.println("c4.maxSpeed : " + c4.maxSpeed);
		System.out.println("c4.color : " + c4.color);
		
		c1.company = "���";
		System.out.println(c1.company);
	}
}
/* 
 �����ε�
 ������/�޼���
 -�̸��� ����.
 -�Ű������� Ÿ��,����,������ �޶���Ѵ�.
 */