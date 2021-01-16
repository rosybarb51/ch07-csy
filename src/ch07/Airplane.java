package ch07;

// 부모 클래스
public class Airplane {
	public void land() {
		System.out.println("착륙합니다.");
	}
	
//	오버라이딩될 메서드 
	public void fly() {
		System.out.println("일반 비행 합니다.");
	}
	
	public void takeOff() {
		System.out.println("이륙합니다.");
	}
}
