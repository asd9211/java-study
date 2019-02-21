package myfolder;

import java.util.ArrayList;
import java.util.Scanner;

public class Reexam {

	public static ArrayList<Integer> makeNums() {
		ArrayList<Integer> SD = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			int num = (int) (Math.random() * 100) + 1;
			SD.add(num);
		}
		return SD;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> ASD = makeNums();
		for(int i = 0 ; i<ASD.size();i++) {
			System.out.println(ASD.get(i));
		}
	}
}
