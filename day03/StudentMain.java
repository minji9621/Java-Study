package day03;

public class StudentMain {
    public static void main(String[] args) {
        // Student ��ü ����
        Student student = new Student("minji", 28);

        // �л� ���� ���
        System.out.println("�л� ����:");
        System.out.println("�̸�: " + student.getName());
        System.out.println("����: " + student.getAge());
        
        // toString �޼��带 �̿��� ���
        System.out.println("toString() �޼��� ��� : ");
        System.out.println(student.toString());
    }
}