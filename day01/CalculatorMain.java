package day01;

public class CalculatorMain {

	public static void main(String[] args) {
		//��ü ����
		Calculator c = new Calculator();
		
		//�÷��� �޼��� ȣ��
		//����� �޾��� ����
		int result1 = c.plus(5,4);
		System.out.println(result1);
		
		//���̳ʽ� �޼��� ȣ��
		int result2 = c.minus(20, 10);
		System.out.println(result2);
		
		//����Ÿ���� ���� �޼��� ȣ��
		c.powerOn();
		c.powerOff();
	}

}
