package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList2 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			int ranNum = (int) (Math.random() * 20) + 1;
			numList.add(ranNum);
		}

		Scanner scan = new Scanner(System.in);
		System.out.println("맞출번호를 ,를 기준으로 입력해주세요.");
		String strNum = scan.nextLine(); //스캐너를 생성해 엔터를 기준으로 대기.
		String[] strNums = strNum.split(","); //,를 기준으로 배열을 만들겠다.
		ArrayList<Integer> anList = new ArrayList<>();

		for (int i = 0; i < strNums.length; i++) {
			int num = Integer.parseInt(strNums[i]); // 메서드의 호출임. String[] strNums는 String 데이터타입이고 anList는 Integer가 데이터타입이기 때문에 strNums를 Integer.parseInt해준다.
			anList.add(num);
		
		}
		int num = 0;
		for(int i = 0 ; i <anList.size();i++) {
			int anNum = anList.get(i);
			if(numList.indexOf(anNum)!=-1) {
				num++;
			}
		}
//		System.out.println(anList) ; //toString이 object에서 그대로 내려온게 아니라 어딘가에서 오버라이딩이 되어 있어서 메모리값이 아닌, 입력한 숫자가 그대로 나온다.

		System.out.println("numList : " + numList);
		System.out.println("anList :" + anList);
		System.out.println("맞춘 갯수 : " + num);
			}
}
