package collection.list;

import java.util.ArrayList;

public class ListExam2 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for(int i = 100;i>=10;i-=10) {
			numList.add(i);
		}
		for(int i=0;i<10;i++) {
			System.out.println(numList.get(i)); //get(i) = 인덱스 넘버
		}
	}
}
