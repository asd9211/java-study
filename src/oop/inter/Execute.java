package oop.inter;

import java.util.ArrayList;
import java.util.List;

public class Execute {

	public static void main(String[] args) {
		Work w = new Developer(); // 인터페이스는 자기만의 영역이 없어서 메모리생성이 불가능함.
		w.goOffice();
		w.working();
		w.eat();
		w.goHome();
		
		w = new Manager();
		w.goOffice();
		w.working();
		w.eat();
		w.goHome();

		List<String> str = new ArrayList<>(); //List는 인터페이스이기 때문에 뉴가 안된다. ( 지만의 영역이 없어서)
											//근데 ArrayList는 가능 얘가 리스트를 구현 받고 있으니깐.
		
	}
}
