package oop.inter;

import oop.inherit.Mother;

public class Daughter extends Mother {

	public static void main(String[] args) {
		Daughter d = new Daughter();
		System.out.println(d.money); // 확장 클래스에서 private를 선언하면 이렇게 이용을 할 수 없음. 영역제어자는 같은 패키지안에 있을 때만 적용가능.
										// 즉, 인터패키지로 이동하게되면, 앞에 영역제어자를 풀어도 이용할 수 없음. 
										// 그러나, 이걸 가능하게 하려면 한가지 방법이 있다. 앞에 public을 붙여주는 것.
										// protected도 가능하다. 단, 전제조건이 상속을 받은 클래스 안에 main메소드가 있어야 가능.
	}
}
