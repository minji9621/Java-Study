package day03;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap02 {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("java", "1234");
		map.put("html", "1111");
		map.put("spring", "1234");
		map.put("boot", "gggg");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
			System.out.println("���̵� : ");
			String id = sc.nextLine().trim();
			
			System.out.println("��й�ȣ : ");
			String pw = sc.nextLine().trim();
			
			System.out.println();
			if(!map.containsKey(id)) { //=id�� map�� �������� �ʴ´ٸ� ����
				System.out.println("�������� �ʴ� ���̵��Դϴ�. �ٽ� �Է��� �ּ���.");
				continue; //Ʋ���� �Է��ϸ� �ٽ� ���ƿͼ� ���̵�� ��й�ȣ�� �Է¹���
			} else {
				if(!(map.get(id)).equals(pw)) { //id�� pw�� ��ġ���� �ʴ´ٸ�
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}else { //�� �� �°� �Է��ߴٸ�
					System.out.println("���̵�� ��й�ȣ�� ��ġ�մϴ�.");
					break;
				}
				
			}
		}
	}

}
