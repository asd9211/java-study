package oop.inherit;

class Mother1{
	int age = 25;
	String name = "송정숙";
	Mother1(){
		System.out.println("가나다");
	}
	void attack() {
		System.out.println("엄마가 등짝 스매싱 기술을 시전합니다.");
	}
}

public class Extends1 extends Mother1{ //보통 다른 자바파일의 클래스를 확장할 때 사용함.
	Extends1(){
		System.out.println("마바사"); // 확장받은 클래스의 생성자를 만들면 상위 클래스의 생성자가 자동으로 먼저 실행됨.
		attack(); // 메소드는 따로 실행시켜야됨.
	}
	public static void main(String[] args) {
	Extends1 m = new Extends1();
	System.out.println(m.age);
		
	}
}
