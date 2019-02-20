package exam.ex04;

public interface Action { // 인터페이스에서 변수선언하면 자동으로 static이다. 하지만, 실무에서는 인터페이스에서 변수 선언을 안한다.
	
	public void speek(); // 인터페이스는 무조건 접근제어자 public 이 디폴트임.
	public void sleep();
	public void eat();
	
	
}
