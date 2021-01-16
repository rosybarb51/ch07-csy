package ch07_1;

public class Tire {
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
//	자손 클래스에서 super(매개변수, ...) 생성자를 통하여 호출되는 Tire클래스의 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		}
		else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}














