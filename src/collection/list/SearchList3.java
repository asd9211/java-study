package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList3 {

	public static void main(String[] args) {
		ArrayList<Integer> AB = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			int num = (int) (Math.random() * 45 + 1);
			AB.add(num);
		}

		Scanner scan = new Scanner(System.in);
		System.out.println(",를 기준으로 6개의 숫자를 입력해주셈.");
		String sca = scan.nextLine();
		String[] str = sca.split(",");
		System.out.println("입력하신 숫자는:" + sca);
	
		int cnt = 0;
		for(String st : str) {
		if(AB.indexOf(Integer.parseInt(st))!=-1)  {
			cnt++;
		}
		}
		System.out.println("numList:" + AB);
		System.out.println("맞춘 갯수는 :" + cnt);
		scan.close();
		
	}
	
}
