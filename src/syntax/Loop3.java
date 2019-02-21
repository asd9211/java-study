package syntax;

public class Loop3 {

	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i=0;i<nums.length;i++) {
			nums[i] = i;
		}
		
		for(int i = 0; i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		for(int num:nums) { 
			System.out.println(num);
		}
	}
}
