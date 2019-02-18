package oop.inter;

public interface PrintSome {
	public void printString(String str); // 인터페이스에선 메서드 선언만 가능하다. 왜 y ? 표준은 통일하는 개념이다. ex ) 리모트의 빨간 버튼은 전원으로 통일해. 근데 이게 어떤 재질이건 몇g이건 정하는건 표준이 아니기 떄문이다.
	public void printChar(char c); // 생성자를 만들 수 없다. 왜 y? 메서드의 자기만의 영역을 만들 수 없기 떄문에 이 인터 페이스로는 메모리의 호출이 불가능하다.
	public void printInt(int num); // 얘 접근제어자는 public이다. 인터페이스안에서는 메서드 앞에 쓸수 있는 접근제어자는 public 밖에없다. 안써도 public이다.
}
