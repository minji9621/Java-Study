package day03;

public class StringEx03 {

	public static void main(String[] args) {
		String s1 = "hello world";
		String s2 = " hello world ";
		String s3 = "HELLO WORLD";
		System.out.println(s1.charAt(0)); //s1�� 0��° �ε����� �ִ� ���� ��ȯ
		System.out.println(s1.indexOf('w')); //������ ��ġ�� ��ȯ
		System.out.println(s1.indexOf('k')); //�ش� ���ڰ� ���� �� -1 ��ȯ
		System.out.println(s1.lastIndexOf('l')); //���� ���ڵ� �� ���� �������� �ִ� ������ �ε��� ��ġ ��ȯ
		System.out.println(s1.replace('h', 'a')); //������ ���������� ��ü
		System.out.println(s1.replaceAll("hello", "aaaa")); //���ڿ��� �ٲ㼭 ��ü
		System.out.println(s1.toUpperCase()); //�ҹ��ڸ� �빮�ڷ� ��ȯ���ִ� �޼���
		System.out.println(s3.toLowerCase()); //�빮�ڸ� �ҹ��ڷ� ��ȯ���ִ� �޼���
		System.out.println(s1.substring(6)); //6��° �ε������� ������ �� ������ش�.
		System.out.println(s1.substring(6,9)); //6��° �ε������� 8��° �ε�������(9��°�� ������)
		System.out.println(s1.length()); //���ڿ��� �����̹Ƿ� 1���� �����Ѵ�.(�ε��� ������ 0���� ���� ����!!)
		System.out.println(s2.trim()); //��,�� ���� �������ִ� �޼���
		String s4 = "java html css spring";
		String[] s = s4.split(" ");
	}
}
