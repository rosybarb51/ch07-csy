package ch07_1;

public class DriverMain {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
//		Vehicle v = new Vehicle();
		
//		Driver 클래스의 멤버 메서드 drive()는 매개변수로 Vehicle 클래스의 객체를 받음
//		매개변수의 다형성을 통해서 실제로 넘겨준 것은 Bus, Taxi 클래스의 객체를 넘겨 줌
		driver.drive(bus);
		driver.drive(taxi);
//		driver.drive(v);
	}
}
