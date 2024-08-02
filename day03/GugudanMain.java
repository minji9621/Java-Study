package day03;

class Gugudan {
	void printGugudan(int num) {
		for(int i = 1; i <= 9; i++) {
			int result = num * i; //출력할 단*곱해지는 1부터 9까지의 수를 result에 저장
			System.out.println(num+"*"+i+"="+result); //num*i=result
		}
	}
}

public class GugudanMain {
	public static void main(String[] args) {
		Gugudan gugu = new Gugudan(); //객체 생성
		gugu.printGugudan(10); //몇 단 출력할건지
	}

}
