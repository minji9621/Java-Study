package day01;

public class Car2 {
	//����
	String company; //������ (����� ���� �־��� ���� �� �ڸ����� �ٷ� �־��ش�.ex:String company = "����";)
	int maxSpeed; //�ִ�ӵ�
	String model; //����
	String color; //����
	

	//���� : Ŭ������(�Ű�����){�����ڵ�}
	Car2(){}//�Ű������� ���� ������ : �⺻������
	Car2(String company){
//		this.company = company;
		//�ٸ� ������ ȣ���ϴ� ���(ȣ���� �� �ܿ��� �⺻���� ���� ä���־���)
		this(company, null, 0, null);
	}
	Car2(String company,String model){
//		this.company = company;
//		this.model = model;
		this(company, model, 0, null);
	}
	Car2(String company, String model, int maxSpeed){
//		this.company = company;
//		this.model = model;
//		this.maxSpeed = maxSpeed;
		this(company, model, maxSpeed, null);
	}
	Car2(String company, String model, int maxSpeed, String color){
		this.company = company;
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.color = color;
	}
}