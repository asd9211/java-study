package exam.ex03;

public class MultiDimension {
public int[][] nums = new int[100][];
	
	public static void main(String[] args) {
		MultiDimension md = new MultiDimension();
		
		//다차원 배열의 초기화.
		for(int i = 0; i<md.nums.length;i++) {
			md.nums[i] = new int[i+1];
			//System.out.println(i+" 층의 방 개수 : " + md.nums[i].legnth);
		}
		//다차원 배열의 초기화 끝.
	
		int num = 1;
		for(int i = 0; i<md.nums.length;i++) {
			System.out.print(i + "번째 : ");
			for(int j=0; j<md.nums[i].length;j++) {
				md.nums[i][j] = num++;
				System.out.print(md.nums[i][j] + ",");
			}
			System.out.println("");
		}
		
		//선생님 풀이 .(num 선언 후 num++만.)
	}
	
	
	
}
