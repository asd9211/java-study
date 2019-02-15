package oop.inherit;

class GrandFather {	
	void work() {
		System.out.println("할아버지가 농사를 짓습니다.");
	}
		
}

class Father extends GrandFather{
	int num = 1;
	void work() {
		System.out.println("아빠가 일함.");
	}

}

public class Son extends Father {
	
	Son(){
		work();  //앞에 this. 생략되어있음
	}
	
	void work() {								// 모든 클래스는 object에서 파생한다. 최상위 개념은 object다. ex)호모사피엔스 -> 현인류
		super.work();							//super. 은 오버라이딩일 경우, 상위개념의 상속 메소드를 그대로 호출한다.
		System.out.println("아들이 공부함."); // 워크라는 메소드가 중복이지만 아들의 메소드가 더 최신이기때문에 이것으로 적용된다.
	} 										// 오버라이딩 조건 1. 무조건 상속이 시작. 2. 메서드명 같아야 한다. 3. 파라메터의 갯수, 데이터타입, 위치도 동일 해야함. 4. 반드시 해당 메소드의 데이터 타입도 같아야한다.
											// 오버로딩의 조건 1. 같은 영역에 있어야 한다. 2. 메서드 명이 같아야한다. 파라메터의 데이터 타입이나, 갯수나, 위치나 셋중 하나가 달라야한다. 메소드의 데이터 타입은 상관없다.
	public static void main(String[] args) { // this -> 이 클래스, super -> 위 클래스
		Son s = new Son();
		s.work();
		}
}
