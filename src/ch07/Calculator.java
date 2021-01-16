package ch07;

// 부모 클래스
public class Calculator {
	// 자손 클래스에 상속해 줄 메서드
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
	
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int minus(int x, int y) {
		return x + y;
	}
	
	public int multi(int x, int y) {
		return x * y;
	}
	
	public int divide(int x, int y) {
		return x / y;
	}
}
