package oop;

public class ClassExam {
	int[] nums = new int[3];
	String str = "abc";

	public static void main(String[] args) {
		ClassExam ce = new ClassExam();
		System.out.println(ce.str);
		ce.str = "바꾸자~";
		System.out.println(ce.str);

		int la = ce.nums.length;
		for (int i = 0; i < la; i++) {
			ce.nums[i] = (i + 1) * 10;
		}
		for (int i = 0; i < la; i++) {
			System.out.println(ce.nums[i]);
		}
	}

}
