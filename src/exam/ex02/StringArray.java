package exam.ex02;

import java.util.Scanner;

public class StringArray {

	public String[] strs;

	public StringArray() {
		strs = new String[5];
	}

	public static void main(String[] args) {
		StringArray sa = new StringArray(); // (); 은 기본 생성자의 호출이다.

		System.out.println("5개의 글자를 , 를 기준으로 입력해주세요.");
		Scanner scan = new Scanner(System.in); // Scanner란 클래스엔 기본 생성자가 없다. 그래서 new scanner();은 오류가 난다.

		String input = scan.nextLine();
		System.out.println(input);
		sa.strs = input.split(","); // split은 배열 메소드라는 것을 알아야함. 왜 y? strs에 대입이 되기 떄문.
		System.out.println("검색할 단어를 입력해주세요.");
		String search = scan.nextLine();

		for (int i = 0; i < sa.strs.length; i++) {
			if (search.equals(sa.strs[i])) {
				System.out.println("sa.strs[" + i + "]=" + sa.strs[i]);
			}
		}
		
//		for (int i = sa.strs.length - 1; i >= 0; i--) {
//			System.out.println("sa.strs[" + i + "]=" + sa.strs[i]);
		scan.close(); // 사용했으면 클로즈를 해야됨. 17번째라인에서 System.in에서 자동으로 열린다고함.
	}

}
