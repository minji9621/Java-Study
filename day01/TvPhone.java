package day01;
//Phone�� �ڼ� Ŭ����
public class TvPhone extends Phone { //����, �޼���
	//����
	int channel;
	
	//������
	TvPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//�޼���
	void turnOn() {System.out.println("ä�� : " + channel + "�� ��û�� �����մϴ�.");}
	void setChannel(int channel) {
		this.channel = channel;
		System.out.println("ä�� : " + channel + "�� ��û�� �ٲߴϴ�.");
	}
	void turnOff() {
		System.out.println("TV ��û�� ����ϴ�.");
	}
}
