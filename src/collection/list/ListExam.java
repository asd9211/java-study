package collection.list;

import java.util.ArrayList;

public class ListExam {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>(); // al의 내용의 데이터타입은 object라 다 저장이 가능하다. 그러면 다 open 이 된거라 <데이터타입> <>을 넣어서 영역을 제한해야한다.
		
		al.add("abc");
		
		System.out.println(al.size());
		
		al.remove(0);
		System.out.println(al.size());
		
		
		ArrayList<Integer> numList = new ArrayList<>(); // 정해진 데이터 타입은 다이아몬드 구간에서 선언할 수 없기때문에, 래퍼클래스를 써야한다. int = integer 이런식
		numList.add(1);
		
	}
}
