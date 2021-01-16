package ch07;

// 부모 클래스로써 Student클래스에게 멤버 변수와 메서드를 상속해줌
public class People {
	public String name;
	public String ssn;
	
//	다른 생성자가 존재할 경우에 super()를 통해서 기본 생성자를 호출하고자 하면 아무런 기능이 없더라도 기본 생성자를 생성하여야함
//	public People() {
//		
//	}
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
