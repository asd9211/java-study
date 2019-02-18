package exam.ex01;

public class Father {

	public String toString() { //object에 toString이 이미 있고 그 데이터타입이 String이기 떄문에 앞에 데이터 타입을 바꿀 수 없다. 오버라이딩의 전제조건이 일치하지 않음.
		return "아빠클래스";
	}
	
	public void printInfo() {
		System.out.println("아빠를 소개하지!");
	}
}
