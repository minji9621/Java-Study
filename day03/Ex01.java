package day03;

public class Ex01 {
    String str = "hello java"; 
    int year = 2020; 

    public void printStr() {
        System.out.println("str ������ ��: " + str);
    }
    public void printYear() {
        System.out.println("year ������ ��: " + year);
    }
    
    // ���� �޼���
    public static void main(String[] args) {
        // Ex01 ��ü ����
        Ex01 example = new Ex01();
        
        // �ν��Ͻ� �޼��� ȣ��
        example.printStr();
        example.printYear();
    }
}
