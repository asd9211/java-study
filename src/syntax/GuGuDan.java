package syntax;

public class GuGuDan {

	public static void main(String[] args) {

		for (int x = 9; x > 0; x--) {
			for (int i = 9; i > 0; i--) {
				System.out.print(x + "X" + i + "=" + (x * i));
				if (i != 1) {
					System.out.print(",");
				}
			}
			System.out.println(" ");
		}
	}
}
