package ch07_1;

import ch07.A;

// 동일한 소스인 B 클래스와 C 클래스의 차이는 패키지가 달라졌기 때문
// protected 접근 제한자를 사용함으로써 외부 패키지에서는 접근이 불가능함
public class C {
	public void method() {
//		A a = new A();
//		a.field = "value";
//		a.method();
	}
}
