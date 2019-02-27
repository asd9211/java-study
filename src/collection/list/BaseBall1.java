package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseBall1 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			int ranNum = (int) (Math.random() * 9) + 1;

			if (numList.indexOf(ranNum) == -1) { // indexOf(R) : R의 값이 몇번째 방에 검출되어 있냐? 없으면 -1
				numList.add(ranNum);
			} else {
				i--;
			}
		}

		int bCnt = 0;
		int sCnt = 0;
		Scanner scan = new Scanner(System.in);
		while (sCnt != 3) {
			bCnt = 0;
			sCnt = 0;
			System.out.println("숫자 ㄱㄱ");
			String[] str = scan.nextLine().split(",");
			
			int[] nums = new int[3];
			for (int i = 0; i < str.length; i++) {
				nums[i] = Integer.parseInt(str[i]);
			}
			for (int i = 0; i < nums.length; i++) {

//			if (nums[i] == numList.get(i)) {

				if (numList.indexOf(nums[i]) != -1) {
					if (i == numList.indexOf(nums[i])) {
						sCnt++;
					} else {
						bCnt++;
					}
				}

			}

			if (sCnt + bCnt == 0) {
				System.out.println("아웃!");
			} else {
				System.out.println(sCnt + "S, " + bCnt + "B");
			}
		}
	}

}
