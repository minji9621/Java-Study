package day03;

class Gugudan {
	void printGugudan(int num) {
		for(int i = 1; i <= 9; i++) {
			int result = num * i; //����� ��*�������� 1���� 9������ ���� result�� ����
			System.out.println(num+"*"+i+"="+result); //num*i=result
		}
	}
}

public class GugudanMain {
	public static void main(String[] args) {
		Gugudan gugu = new Gugudan(); //��ü ����
		gugu.printGugudan(10); //�� �� ����Ұ���
	}

}
