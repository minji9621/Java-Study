package day03;

public class StringEx02 {
	public static void main(String[] args) {
		String str = "�ڹ� ���α׷���";
		
		//.length() : ���ڿ��� ����, ����, ũ��
		int leng = str.length();
		System.out.println(leng);
		
		//.replace() : Ư�� ���ڿ��� �ٸ� ���ڿ��� ��ü
		str.replace("�ڹ�", "java");
		String str2 = str.replace("�ڹ�", "java");
		System.out.println(str2);
		
		//���ڿ� �߶󳻱�
		//.substring(�����ε���) : �����ε���(����)���� ������ ���
		String str3 = str.substring(4);
		System.out.println(str3);
		
		//.substring(����,��),������ �����ϰ� ���� ���� �� �̸�
		String str4 = str.substring(3,5);
		System.out.println(str4);
		
		//.indexOf() : ���ڿ����� Ư�� ���ڿ��� ��ġ�� ��Ÿ��
		int index = str.indexOf("���α׷���");
		System.out.println(index);
		
		//.contains() : �ܼ� ���� ���� ���� ��
		boolean contains = str.contains("���α׷���");
		System.out.println(contains);
		
		//���ڿ� �и�
		//.split() : ������ �� �ִ� ������ �и��� ��
		String str5 = "���,����,����,������,�ٳ���";
		String[] tokens = str5.split(",");
		
		System.out.println("index tokens[0] : " + tokens[0]);
		System.out.println("index tokens[4] : " + tokens[4]);
		
		//.valueOf(�Ű���) : �Ű����� ���ڿ��� ��ȯ 
		String str6 = String.valueOf(100);
		System.out.println(str6);
		
		//.parseInt() : ���ڿ��� int Ÿ������ ��ȯ
		//������ ��ȯ�� �� �ִ� ���ڿ�
		int str7 = Integer.parseInt("1000");
		System.out.println(str7);
	}
}
