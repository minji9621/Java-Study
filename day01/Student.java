package day01;
/* 
��ü ����
  �ڽ� ��ü�� �����Ǵ� ��ó�� ��������
  �θ� ��ü�� ������ �� �ڽ� ��ü�� ����(����� ����) 
 
super();
  �����ϸ� �����Ϸ��� �ڵ����� �߰���
  �⺻������ ����, �Ű������� �ִ� �����ڸ� �ִٸ�
  �ݵ�� �Ű������� �ִ� �����ڸ� ȣ���ؾ� �� 
  
this.�� this()�� super()
  ���������� �ݵ�� ������ ���ο� ù �ٿ� ��ġ�ؾ� ��
*/

public class Student extends People {
	int studentNo;
	
	//������
	Student(String name, String peopleNo, int studentNo){
		super(name,peopleNo); //������ �⺻ �����ڰ� ���� -> ������ �����ڸ� �ݵ�� ȣ���ؾ� ��
		this.studentNo = studentNo;
	}
}
