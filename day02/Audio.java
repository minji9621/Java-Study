package day02;

public class Audio implements RemoteControl {
	private int volume;
	
	// 추상 메서드 구현
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}
	
	// 상수 이용하여 볼륨 조절
	public void setVolume(int volume) {
		if( volume > RemoteControl.MAX_VOLUME ) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if( volume < RemoteControl.MIN_VOLUME ) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨 : "+ this.volume);
	}
}





