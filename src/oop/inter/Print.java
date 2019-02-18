package oop.inter;

import oop.inherit.Animal;

public class Print implements PrintSome{

	
	@Override
	public void printString(String str) { //인터페이스를 구현하려면 인터페이스에 있는 정의를 최소 한번이라도 써야한다.
		System.out.println(str);	
	}

	@Override
	public void printChar(char c) { // 데이터타입, 메소드명, 파라메터도 다 같음.(상속이라는 개념도 들어가야한다.) 즉, 인터페이스에 있는 메소드들을 오버라이드한것.
		System.out.println(c);
	}

	@Override
	public void printInt(int num) { //public
		System.out.println(num);		
		}
	
	public static void main(String[] args) {
		Print p = new Print();
		p.printString("abc");
		
		PrintSome ps = new Print(); //인터페이스라 메모리 생성이 불가능함. PrintSome = new ps; 불가능! but, Print는 PrintSome에 포함되어 지기 떄문에 된다..
		Animal a = new Animal(); // 다른 패키지기떄문에 오류가 뜸. 그러면 Ctrl + shift + o 로 해결. 그럼 3번째 줄에 import.이 생긴다. 
		a.run(); // run에 접근제어자가 없다. void run()이라고 되어있을뿐, 허나 접근제어자를 public으로 넣는다면 오류가 해결됨. public void run() 왜 y? public 은 공공으로 사용할 수 있기때문에
					// 접근 제어자 종류 : [public, protected, default, private,] 영역은 이 순서대로 점점 작아짐.
	
	}
}
