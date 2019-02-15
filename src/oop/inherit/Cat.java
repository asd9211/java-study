package oop.inherit;

public class Cat extends Animal {
	Cat(int age, String type) {
		this.age = age; // 애니멀 있는 에이지를 가르킴. 왜 y? 캣에는 에이지와 타입이 선언안되어 있어서 애니멀꺼를 그대로 받아서 동작한거임.
		this.type = type;
	}

	public static void main(String[] args) {
		Cat cat = new Cat(6, "샴"); // 생성자를 하나라도 만들면 기본생성자 생성이 불가, 파라메터를 맞춰야함.
		cat.eat();
		cat.sleep();
		cat.run();

		Dog dog = new Dog(6, "멍멍이");
		dog.eat();
		dog.sleep();
		dog.run();

	}
}
