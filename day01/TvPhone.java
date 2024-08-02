package day01;
//Phone의 자손 클래스
public class TvPhone extends Phone { //변수, 메서드
	//변수
	int channel;
	
	//생성자
	TvPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//메서드
	void turnOn() {System.out.println("채널 : " + channel + "번 시청을 시작합니다.");}
	void setChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 : " + channel + "번 시청을 바꿉니다.");
	}
	void turnOff() {
		System.out.println("TV 시청을 멈춥니다.");
	}
}
