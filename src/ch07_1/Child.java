package ch07_1;

// Child 클래스는 Parent 클래스를 상속 받음
// Parent 클래스의 모든 멤버를 상속받아 사용할 수 있음
public class Child extends Parent {
	public String field2;
	
	public void method3() {
		System.out.println("Child-method3()");
	}
}
