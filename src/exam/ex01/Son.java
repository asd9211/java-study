package exam.ex01;

public class Son extends Father {  // 얘는 Son, Father, Object 세개의 이름을 가지고 있다. new son에서 이 세개를 받을 수 있다.

	public String toString() {
		return "아들클래스";
	}

	public void printInfo() {
		System.out.println("지금부터 내 소개를 시작하지!");
	}
}
