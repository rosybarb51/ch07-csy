package ch07;

// People 클래스를 상속받아 name, ssn을 멤버로 재사용함
public class Student extends People {
	public int studentNo;
	
//	부모 클래스를 상속받은 자손 클래스는 객체 생성 시 부모 클래스의 생성자를 호출해야함
//	컴파일러가 자동으로 부모 클래스의 생성자를 호출하는 것은 부모 클래스의 기본 생성자 뿐임
//	부모 클래스가 기본 클래스를 가지고 있지 않을 경우 개발자가 직접 부모 클래스의 생성자를 호출해야 함
//	부모 클래스의 생성자를 호출하기 위한 명령어인 super()를 가장 첫줄에 입력해야 함
	public Student(String name, String ssn, int studentNo) {
//		super();
		super(name, ssn);
		this.studentNo = studentNo;
	}
}
