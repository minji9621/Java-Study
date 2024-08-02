package day02;

public interface RemoteControl {
	// 상수 변수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상 메서드
	// 리턴타입 변수명 매개변수 까지만 알려준다. : 선언부
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}