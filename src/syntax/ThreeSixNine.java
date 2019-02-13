package syntax;

public class ThreeSixNine {

	public static void main(String[] args) {
		for (int i = 0; i < 30; i++) {
			int mod = i%10;
			if (mod == 3 || mod == 6 || mod == 9) {
				System.out.println("짝");
			} else {
				System.out.println(i);
			}
		}
	}
}
