package day01;

public class Car2 {
	//변수
	String company; //제조사 (공통된 값을 넣어줄 때는 이 자리에서 바로 넣어준다.ex:String company = "현대";)
	int maxSpeed; //최대속도
	String model; //차종
	String color; //색상
	

	//형태 : 클래스명(매개변수){실행코드}
	Car2(){}//매개변수가 없는 생성자 : 기본생성자
	Car2(String company){
//		this.company = company;
		//다른 생성자 호출하는 방법(호출할 값 외에는 기본값을 맞춰 채워넣어줌)
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