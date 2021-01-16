package ch07;

// 자손 클래스
public class Computer extends Calculator {
//	부모 클래스에서 상속받은 areaCircle() 메서드
//	오버라이딩을 하게 되면 상속받은 areaCircle() 메서드를 사용하지 않고(가려지고) 자손 클래스에서 새로 재정의한 areaCircle() 메서드를 사용하게 됨
//	오버라이딩 : 부모 클래스에서 상속 받은 멤버를 그대로 사용하지 않고, 자손 클래스에 맞게 수정해서 사용하는 방식
	
//	어노테이션 : 컴파일러에게 특정 작업을 수행한다고 알려주는 메시지
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	
	// 문제 3) Calculator 클래스를 상속받아 사칙연산을 하는 프로그램을 작성하시오
	// 조건1. Computer 클래스가 Calculator 클래스를 상속받음
	// 조건2. 사칙 연산 메서드를 모두 override 함
	// 조건3. Computer 클래스에는 화면에 결과를 프린트 하기위한 printer() 메서드가 존재함
	// 조건4. 오버라이딩한 메서드는 printer() 메서드를 사용하여 결과를 출력함
	// 조건5. printer() 메서드는 매개변수를 2개 입력받고, 그 중 1개를 이용하여 사칙연산 중 어떤 것인지 판단하여 화면에 결과를 출력
	// 카톡으로 보낼때 양식 : 20201221_3번_이름.zip
	
	private void printer(int result, char oper) {
		if (oper == '+') {
			System.out.println("두 수의 덧셈은 " + result);
		}
		else if (oper == '-') {
			System.out.println("두 수의 뺄셈은 " + result);
		}
		else if (oper == '*') {
			System.out.println("두 수의 곱셈은 " + result);
		}
		else {
			System.out.println("두 수의 나눗셈은 " + result);
		}
	}
	
	@Override
	public int plus(int x, int y) {
		int result = x + y;
		printer(result, '+');
		
		return result;
	}
	
	@Override
	public int minus(int x, int y) {
		int result = x - y;
		printer(result, '-');
		
		return result;
	}
	
	@Override
	public int multi(int x, int y) {
		int result = x * y;
		printer(result, '*');
		
		return result;
	}
	
	@Override
	public int divide(int x, int y) {
		int result = x / y;
		printer(result, '/');
		
		return result;
	}
}
















