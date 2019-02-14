package oop;

public class ClassExam5 {
	int a = 2;

	ClassExam5() { // ClassExam5(){} 생성자의 정의.
		System.out.println("난 기본 생성자!");

	}

	ClassExam5(int a) {
		System.out.println("난 기본 생성자 아님!");
	}

	public static void main(String[] args) {
		ClassExam5 ce = new ClassExam5(); // 생성자는 호출이 안되기때문에 새로운 메모리를 만들어줘야함. (new)
		ce.a = 4;
		System.out.println(ce.a);
	}
}
