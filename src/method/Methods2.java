package method;

public class Methods2 {
	static void add(int a, int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		add(1,5);
		int a = 1;
		add(a,3);
		int b = 5;
		add(a,b);
	}
}