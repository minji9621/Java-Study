package day01;

class AA {
	int x;
	
	//������
	AA(){
		this(100); //�ٸ� �����ڸ� ȣ��
	}
	AA(int x){
		this.x = x;
	}
	
	//�޼���
	void aa() //�����
	{ 
		System.out.println("������ �޼��� aa()"); //������
	}
}

class BB extends AA {
	int y;
	BB(){
		//x = 400;�� ���������� ������ �����ڸ� ȣ���ؼ� �ٲ��ִ� ���� �� ���� �ڵ�!
		super(400);
		y = 500;
	}
	
	@Override
	void aa() //�������̵� : �����
	{ 
		System.out.println("�ڼ��� ������ bb()");
	}
	void aa(int a) { //�����ε� = ��������
		
	}
}


public class Main2 {

	public static void main(String[] args) {
		BB bb = new BB();
		System.out.println(bb.x);
		System.out.println(bb.y);
		bb.aa(); //�Ű����� ���� �޼��尡 ȣ���
	}
}
/*
�������̵�
	- �����
	- �޼����� �����(�Ű����� �κб���)�� ���� �����θ� �ٸ���
	- ���������� ���ϰ�(������ ����) ����(public -> private�� ���� �Ұ�)
	
������̼�
	- ���� ���� �˷��ִ� ����
	- ���� ����
	- @Override : �������̵�
*/
