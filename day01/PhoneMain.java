package day01;

public class PhoneMain {
	public static void main(String[] args) {
		TvPhone tPhone = new TvPhone("�ڹ���","����", 10);
		
		//Phone���κ��� ��ӹ��� �����б�(���)
		System.out.println("�� : " + tPhone.model);
		System.out.println("���� : " + tPhone.color);
		
		//TvPhone�� �����б�(���)
		System.out.println("ä�� : " + tPhone.channel);
		
		//Phone���κ��� ��ӹ��� �޼��� ȣ�� : �޼��� �̸�()
		tPhone.powerOn();
		tPhone.bell();
		tPhone.sendVoice("��������");
		tPhone.receiveVoice("�ȳ��ϼ���.java�Դϴ�.");
		tPhone.powerOff();
		
		//TvPhone�� �޼��� ȣ��
		tPhone.turnOn();
		tPhone.setChannel(12);
		tPhone.turnOff();
	}

}
