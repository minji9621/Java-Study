package day01;

public class PhoneMain {
	public static void main(String[] args) {
		TvPhone tPhone = new TvPhone("자바폰","검정", 10);
		
		//Phone으로부터 상속받은 변수읽기(사용)
		System.out.println("모델 : " + tPhone.model);
		System.out.println("색상 : " + tPhone.color);
		
		//TvPhone의 변수읽기(사용)
		System.out.println("채널 : " + tPhone.channel);
		
		//Phone으로부터 상속받은 메서드 호출 : 메서드 이름()
		tPhone.powerOn();
		tPhone.bell();
		tPhone.sendVoice("여보세요");
		tPhone.receiveVoice("안녕하세요.java입니다.");
		tPhone.powerOff();
		
		//TvPhone의 메서드 호출
		tPhone.turnOn();
		tPhone.setChannel(12);
		tPhone.turnOff();
	}

}
