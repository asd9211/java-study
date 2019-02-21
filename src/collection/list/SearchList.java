package collection.list;

import java.util.ArrayList;

public class SearchList {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		for(int i=1;i<=5;i++) {
			intList.add(i);
		}
		System.out.println(intList.indexOf(6)); //indexOf로 없는 값을 출력하면 -1이 나온다. 왜 y? 인덱스 오브는 인트형이고 인덱스에서는 -1이 나올 수 없기때문에 없는 값을 출력한것.
	}
}
