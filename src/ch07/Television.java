package ch07;

public class Television {
	int channel;
	int volume;
//	final : 초기화 이후 절대 변경되지 않는 변수
//	최대 및 최소 볼륨 지정
	final int maxVolume = 25;
	final int minVolume = 0;
//	최대 및 최소 채널 지정
	final int maxChannel = 15;
	final int minChannel = 1;
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println(this.channel + "번 채널로 변경합니다.");
	}
	
	void channelUp() {
		channel++;
//		채널을 최대 채널보다 크게 되면 최소 채널로 변경
		if (channel > maxChannel) {
			channel = minChannel;
		}

		System.out.println(this.channel + "번 채널로 변경합니다.");
	}
	
	void channelDown() {
		channel--;
//		채널은 최소 채널 이하로 내려가면 최대 채널로 변경
		if (channel < minChannel) {
			channel = maxChannel;
		}

		System.out.println(this.channel + "번 채널로 변경합니다.");
	}
	
	void volumeUp() {
		volume++;
//		볼륨은 최대값 이상의 값이 되면 최대값으로 고정
		if (volume > maxVolume) {
			volume = maxVolume;
			System.out.println(maxVolume + "가 최대 볼륨입니다.");
		}
		else {
			System.out.println("볼륨을 1 올립니다.\n현재 볼륨 " + volume);
		}
	}
	
	void volumeDown() {
		volume--;
//		볼륨은 최소값 이하가 되면 최소값으로 고정
		if (volume < minVolume) {
			volume = minVolume;
			System.out.println(minVolume + "가 최소 볼륨입니다.");
		}
		else {
			System.out.println("볼륨을 1 내립니다.\n현재 볼륨 " + volume);
		}
	}
}
