package syntax;

public class Loop4 {

	public static void main(String[] args) {
		for(int i = 1;i<=10;i++) {
			if(i%2!=0) continue; // 조건을 만족하면 위로 올라가서 포문을 다시 돌린다. 만족하지 않을 경우 밑에껄 실행한다.
			System.out.println(i);
		}
	}
}
