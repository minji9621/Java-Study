package day01;

class AAA {
	int x = 100;
}

class BBB extends AAA {
	int y = 111;
	int x = 222; //BBB Ŭ������ ����
	
	//�޼���
	void aa() {
		int x = 50; //��������
		System.out.println(x);
		System.out.println(this.x); //Ŭ���� �ڽ��� ����
		System.out.println(super.x); //����Ŭ������ ����
	}
}

public class Main3 {
	public static void main(String[] args) {
		BBB b = new BBB();
		b.aa();
	}

}
