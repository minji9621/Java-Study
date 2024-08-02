package day02;

public class Television implements RemoteControl {
	// private: 같은 클래스 내에서만 접근 가능
	private int volume;
	
	// 추상 메서드 구현
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	// 인터페이스의 상수를 이용하여 volume 값을 제한
	@Override
	public void setVolume(int volume) {
		if( volume > RemoteControl.MAX_VOLUME ) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if( volume < RemoteControl.MIN_VOLUME ) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨은 : "+ this.volume);
	}
}










