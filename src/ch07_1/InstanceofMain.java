package ch07_1;

public class InstanceofMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
	}
	
	public static void method1(Parent parent) {
//		instanceof 연산자 : 지정한 객체가 지정한 클래스 타입인지 확인하는 연산자
//		지정한 클래스 타입이 맞으면 true, 틀리면 false
		if(parent instanceof Child) {
//			Child 클래스 타입의 변수를 선언하고, 매개변수로 받은 Parent객체를 강제 타입 변환함
			Child child = (Child)parent;
			System.out.println("method1 - Child로 변환 성공");
		}
		else {
			System.out.println("method1 - 변환되지 않음");
		}
	}
	
//	instanceof 연산자를 사용하지 않고 바로 강제 타입 변환을 진행하기 때문에 매개변수가 Child 클래스 타입의 객체가 아닐 경우 오류가 발생함 
	public static void method2(Parent parent) {
		Child child = (Child)parent;
		System.out.println("method2 - child로 변환 성공");
	}

}
