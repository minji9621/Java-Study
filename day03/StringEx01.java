package day03;
/*
 String Ŭ����
 - �ڹ� ���ڿ��� ����� �� �ֵ��� String Ŭ���� ����
 1.�����ڸ� �̿��ϴ� ���
 2.�ڵ�󿡼� String ��ü�� �ڵ� �����Ǵ� ���
 */


public class StringEx01 { //String�̶�� Ÿ���� �̹� �����ϱ� ������ Ŭ���� �̸��� ����� ����

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); //false,new ���ο� ��ü.�ּ� �ٸ�.
		System.out.println(str1.equals(str2)); //true,��ü�� ���� ���ڿ� ��
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
	}

}
