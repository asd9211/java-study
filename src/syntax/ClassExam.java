package syntax;

public class ClassExam {
	int a = 1;
	char c = '1';
	String s = "1";

	void test() {
		System.out.println("난 ClassExam꺼!");
	}
	public static void main(String[] args) {
		int a = 3;
		ClassExam ce = new ClassExam();
		System.out.println(ce.a);
		System.out.println(ce.c);
		System.out.println(ce.s);
		ce.test(); //그냥 test();호출은 불가하다. 왜 why? void test()는 ClassExam꺼다. 그걸 호출하려면 앞에 ce.붙여라.
	}
}
