package exam.ex02;

public class IntArray {

	public int[] nums = new int[10];

	public boolean compare(int num) {

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 0)
				return false;

			if (nums[i] == num)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

		IntArray ia = new IntArray();
		for (int i = 0; i < ia.nums.length; i++) {
			double b = Math.random();
			int num = (int) (b * 10) + 1;

//			ia.nums[i] = (int) (b * 10) + 1;

			if (ia.compare(num)) {
				i--;
			} else {
				ia.nums[i] = num;
			}

		}

		for (int i = 0; i < ia.nums.length; i++) {
			for (int n = i + 1; n < ia.nums.length; n++) {

				if (ia.nums[i] < ia.nums[n]) {
					int tmp = ia.nums[i];
					ia.nums[i] = ia.nums[n];
					ia.nums[n] = tmp;
				}
			}
		}
		for (int i = 0; i < ia.nums.length; i++) {
			System.out.println("ia.nums[" + i + "] = " + ia.nums[i]);

		}
	}
}
