package ch07_1;

public class ChildMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Parent();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		Child child = new Child();
		child.field1 = "child data1";
		child.field2 = "child data2";
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println("-----자동 타입 변환 -----");
//		parent 객체에 자손 클래스 타입의 객체 child를 대입한 것이 가능함(다형성, 자동 타입 변환)
		parent = child;
		parent.method1();
		parent.method2();
//		자손 클래스 타입의 객체를 부모 클래스 타입의 변수에 대입하면 자동 타입 변환이 발생하며, 부모 클래스 타입이 가지고 있는 멤버만 사용이 가능함
//		parent.field2 = "child data2";
//		parent.method3();
		
		System.out.println("-----강제 타입 변환 -----");
//		부모 클래스 타입에 저장된 객체가 원래 자손 객체였을 경우 강제 타입 변환을 통해서 다시 자손 클래스 타입의 객체로 변환할 수 있음
//		다시 자손 클래스 타입으로 변환된 객체는 자신의 멤버를 모두 사용할 수 있음
		Child child2 = (Child)parent;
		child2.field2 = "child data2";
		child2.method3();
		
	}
}













