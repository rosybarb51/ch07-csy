package ch07;

public class CellPhone {
	String model;
	String color;
	
//	명시적으로 입력된 생성자가 없기 때문에 자손 객체의 생성자에서 자동으로 super()를 사용하여 부모 객체의 기본 생성자를 호출함
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	void sendVoice(String message) {
		System.out.println("자기 : " + message);
	}
	
	void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}
	
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
