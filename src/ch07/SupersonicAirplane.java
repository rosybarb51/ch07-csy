package ch07;

// Airplane 클래스를 상속한 SupersonicAirplane 클래스
public class SupersonicAirplane extends Airplane {
//	static final 을 사용하여 상수로 선언함
//	클래스명.상수명 형태로 사용해야 함
//	상수는 선언과 동시에 초기화, 혹은 static {} 코드 블럭을 이용하여 초기화해야 함
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
//	Airplane 클래스에서 상속받은 fly() 메서드를 오버라이딩함
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}
		else {
//			부모 클래스의 fly() 메서드를 호출
			super.fly();
		}
	}
	
}
