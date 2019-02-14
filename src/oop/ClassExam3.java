package oop;

public class ClassExam3 {

	int num = 2;

	void setNum(int num) {
		System.out.println(num);
	}

	int getNum() {
		return num;
	}

	public static void main(String[] args) {
		ClassExam3 ce = new ClassExam3(); //기본생성자. 
		System.out.println(ce.num);
		ce = new ClassExam3();
		ce.num = 5;
		System.out.println(ce.getNum());
		ce.setNum(1);
		System.out.println(ce.getNum());
	}
}
