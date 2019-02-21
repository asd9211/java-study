package syntax;

public class Condition3 {

	public static void main(String[] args) {
		int num = 3;
		
		switch(num) {
		case 1 :
			System.out.println("1이네요~");
			break;
		case 2 : 
			System.out.println("2이네요~");
			break;
		case 3 : 
			System.out.println("3이네요~");
			break; // break면 하나 찍고 나간다. break가 빠지면 조건에 충족하는 열 이하를 다실행한다.
		case 4 : 
			System.out.println("4이네요~");
			break;
		default : 
			System.out.println("1~4아니네요~");
			
		}
	}
}
