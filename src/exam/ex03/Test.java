package exam.ex03;

public class Test {

	public static int num = 1;

	public static void main(String[] args) {

		Test[] ts = new Test[3];
		for (int i = 0; i < ts.length; i++) {
			ts[i] = new Test(); // 없어도 되는 구문
			ts[i].num = i;
		}

		for (int i = 0; i < ts.length; i++) {

			System.out.println(ts[i].num);
		}
	}

}
