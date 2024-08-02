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
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.println("아이디 : ");
			String id = sc.nextLine().trim();
			
			System.out.println("비밀번호 : ");
			String pw = sc.nextLine().trim();
			
			System.out.println();
			if(!map.containsKey(id)) { //=id가 map에 존재하지 않는다면 실행
				System.out.println("존재하지 않는 아이디입니다. 다시 입력해 주세요.");
				continue; //틀리게 입력하면 다시 돌아와서 아이디와 비밀번호를 입력받음
			} else {
				if(!(map.get(id)).equals(pw)) { //id와 pw가 일치하지 않는다면
					System.out.println("비밀번호가 일치하지 않습니다.");
				}else { //둘 다 맞게 입력했다면
					System.out.println("아이디와 비밀번호가 일치합니다.");
					break;
				}
				
			}
		}
	}

}
