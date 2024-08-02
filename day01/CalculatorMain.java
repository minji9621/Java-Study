package day01;

public class CalculatorMain {

	public static void main(String[] args) {
		//객체 생성
		Calculator c = new Calculator();
		
		//플러스 메서드 호출
		//결과를 받아줄 변수
		int result1 = c.plus(5,4);
		System.out.println(result1);
		
		//마이너스 메서드 호출
		int result2 = c.minus(20, 10);
		System.out.println(result2);
		
		//리턴타입이 없는 메서드 호출
		c.powerOn();
		c.powerOff();
	}

}
