package exam.ex04;

public class Cat implements Action { // Action도 상위개념이라 Action이라고 불리울 수 있다.

	@Override
	public void speek() {
		// TODO Auto-generated method stub
		System.out.println("야옹~~");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("동동이가 잠.");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("동동이가 생선 먹음");
	}

}
